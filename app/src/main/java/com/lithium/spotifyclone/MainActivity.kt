package com.lithium.spotifyclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lithium.spotifyclone.Fragments.Biblioteca
import com.lithium.spotifyclone.Fragments.Buscar
import com.lithium.spotifyclone.Fragments.Home
import com.lithium.spotifyclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var Content: FrameLayout? = null

    private var mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId) {
            R.id.nav_inicio -> {
                val fragment = Home.newInstance()
                addFragment(fragment)

                return@OnNavigationItemSelectedListener true // Para a animação que aumenta o botão de navegação funcionar
                }
            R.id.nav_buscar -> {
                val fragment = Buscar.newInstance()
                addFragment(fragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_biblioteca -> {
                val fragment = Biblioteca.newInstance()
                addFragment(fragment)

                return@OnNavigationItemSelectedListener true
            }
        }
        false
        }

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Content = binding.content

        // Capturar o id do menu e atribuir a variavel com a função when
        val bottom_menu = binding.bottomMenu
        bottom_menu.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        // Chamar a Home quando iniciar o app
        val fragment = Home.newInstance()
        addFragment(fragment)




    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment, fragment.javaClass.simpleName)
            .commit()
    }



}