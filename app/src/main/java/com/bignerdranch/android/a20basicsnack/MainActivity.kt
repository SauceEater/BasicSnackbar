package com.bignerdranch.android.a20basicsnack

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.bignerdranch.android.a20basicsnack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun defaultsnackbar(view: View) {
        var snackbar = Snackbar.make(view, "Программирование SnackBar",Snackbar.LENGTH_LONG).show()
    }
    fun actionsnackbar(view: View) {
        var snackbar = Snackbar.make(view, "Ты что-то поменял",Snackbar.LENGTH_LONG)
        snackbar.setAction("Отменить изменения??", View.OnClickListener { Snackbar.make(view, "Все изменения отменены",Snackbar.LENGTH_LONG).show()})
        snackbar.show()
    }
    fun special(view: View) {
        var snackbar = Snackbar.make(view, "Нужно повторить ещё раз",Snackbar.LENGTH_LONG)
        snackbar.setAction("повторить", View.OnClickListener { Snackbar.make(view, "дело сделано",Snackbar.LENGTH_LONG).show()})
        snackbar.show()
    }
    fun message(view: View) {
        var snackbar = Snackbar.make(view, "Был нажат FloatingActionButton",Snackbar.LENGTH_LONG).show()
    }
}