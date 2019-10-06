package com.example.bboba

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_givemain.*
import kotlinx.android.synthetic.main.activity_main.*


class GiveMainActivity : AppCompatActivity(),MapFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_givemain)
        setSupportActionBar(give_toolbar)
        //supportActionBar!!.setDisplayShowTitleEnabled(false) // 타이틀 안보이게 하기
        supportActionBar!!.title = "프린트 요청 목록 확인"
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ListFragment(), "List")
        adapter.addFragment(MapFragment(), "Map")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}