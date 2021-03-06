package com.jcsanket.noteapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.jcsanket.noteapp1.adapter.NotesAdapter
import kotlinx.android.synthetic.main.activity_home.*
import org.jetbrains.anko.startActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fakeAppbarRL.setOnClickListener{startActivity<NewNoteActivity.kt>()}
        notesRV.layoutManager = GridLayoutManager(this,2)
        notesRV.adapter = Notes.Adapter(this)
    }

    override fun onResume() {
        super.onResume()
        refresh()
    }

    public override fun onDestroy() {
        super.onDestroy()
        notesRV!!.adapter = null
    }

    private fun refresh() {
        (notesRV!!.adapter as NotesAdapter).refresh()
    }


}
