package com.example.sprint_three_api_alertdialog.ui.fragments.dialog

import android.content.Context
import android.graphics.Bitmap
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.bumptech.glide.Glide
import com.example.sprint_three_api_alertdialog.R
import com.example.sprint_three_api_alertdialog.base.BaseFragment
import com.example.sprint_three_api_alertdialog.common.Resource
import com.example.sprint_three_api_alertdialog.databinding.FragmentDialogBinding
import com.example.sprint_three_api_alertdialog.models.dialog.DialogModels
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.models.synonyms.SynonymModel
import com.example.sprint_three_api_alertdialog.setupImageWithGlide
import com.example.sprint_three_api_alertdialog.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DialogFragment :
    BaseFragment<FragmentDialogBinding, DialogViewModel>(R.layout.fragment_dialog) {

    override val binding by viewBinding(FragmentDialogBinding::bind)
    override val viewModel: DialogViewModel by viewModels()

    override fun setupSubscribes() {
        subscribeToTranslate()
        initializeSub()

    }

    private fun initializeSub() {

    }

    private fun subscribeToTranslate() = with(binding) {

        ok.setOnClickListener {

            val word = et.text?.trim().toString()
            val model = Word(word)

            viewModel.fetchTranslate(model).subscribe(
                onError = {
                    Log.e("dialogLoo", "setupSubscribes: $model")
                },
                onSuccess = { model ->
                    toast("$model")

                    Log.e(
                        "dialogOlolo",
                        "subscribeToTranslate: " + model.translation + model.image_url
                    )

                    if (model != null) {
                        binding.tv.text = model.translation.toString()
                        binding.img.load(model.image_url.toString())
                    }
                }
            )
        }
    }

}

object BlurUtils{
    fun blur(context: Context, bitmap: Bitmap, radius: Float): Bitmap {
        val rsContext = RenderScript.create(context)
        val input = Allocation.createFromBitmap(rsContext, bitmap)
        val output = Allocation.createTyped(rsContext, input.type)
        val script = ScriptIntrinsicBlur.create(rsContext, Element.U8_4(rsContext))

        script.setRadius(radius)
        script.setInput(input)
        script.forEach(output)

        output.copyTo(bitmap)
        rsContext.destroy()

        return bitmap
    }
}