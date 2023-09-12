package com.example.slidenavbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.example.slidenavbar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.hambur)


        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> Toast.makeText(this , "Home Is Clicked" , Toast.LENGTH_LONG).show()
                R.id.message -> Toast.makeText(this , "Message Is Clicked" , Toast.LENGTH_LONG).show()
                R.id.sync -> Toast.makeText(this , "Sync Is Clicked" , Toast.LENGTH_LONG).show()
                R.id.delete -> Toast.makeText(this , "Delete Is Clicked" , Toast.LENGTH_LONG).show()
                R.id.settings -> Toast.makeText(this , "Settings Is Clicked" , Toast.LENGTH_LONG).show()
                R.id.login -> Toast.makeText(this , "Login Is Clicked" , Toast.LENGTH_LONG).show()
            }

            true
        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {

                binding.drawerLayout.openDrawer(GravityCompat.START)
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }


}