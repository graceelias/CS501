package com.example.helloworld

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import com.example.helloworld.databinding.ActivityMainBinding
    import android.view.View

    class MainActivity : AppCompatActivity()
    {
        private lateinit var binding: ActivityMainBinding

        private var clicked = false

        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.button.setOnClickListener{
                clicked = true
                updateString()
            }
            updateString()
        }

        private fun updateString(){
            if(!clicked)
            {
                val stringTextResId = R.string.blank
                binding.stringTextView.setText(stringTextResId)
            }
            else
            {
                val stringTextResId = R.string.hello_world
                binding.stringTextView.setText(stringTextResId)
            }
        }
    }