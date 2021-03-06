package com.hamidjonhamidov.whoiskhamidjon.ui.source_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.hamidjonhamidov.whoiskhamidjon.R
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.*
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.Constants.FILE_TYPE_BLUE_FILE
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.Constants.FILE_TYPE_LEAF
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.Constants.FILE_TYPE_PACKAGE
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.Constants.RES_ID_EXTRA
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.Constants.STATE_CLOSED_IN_VIEW
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.Constants.STATE_OPENED_IN_VIEW
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.CreateViews.connectMainToParent
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.CreateViews.connectCl1OnBottomCl2InsideTopCl3
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.CreateViews.createConstraintLayout
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.CreateViews.createImageViewForFileType
import com.hamidjonhamidov.whoiskhamidjon.ui.source_code.custom_treeview.CreateViews.createTextViewForFileName
import kotlinx.android.synthetic.main.activity_source_code.*
import java.util.*

class SourceCodeActivity : AppCompatActivity(), View.OnClickListener {

    private val TAG = "AppDebug"

    val hashMap = TreeMap<Int, FileView>()

    var utilFuncs = UtilFunctions()

    lateinit var root: FileView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_source_code)

        setSupportActionBar(tool_bar_source_code)
        supportActionBar?.title = "Source Code"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initializeFileHierarchy()
    }

    private fun initializeFileHierarchy() {
        root = FileView(
            type = FILE_TYPE_BLUE_FILE,
            name = "root",
            parent = null,
            containerCl = cl_root_file_container,
            childClMain = cl_file_view,
            expandIv = iv_expand,
            fileTypeIv = iv_file_type,
            fileTextTv = tv_file_name
        )

        cl_file_view.setOnClickListener(this)
        hashMap[R.id.cl_file_view] = root

        utilFuncs.createHierarchyFromStringList(root, StaticData.leafFileList)

        // when view is created, open certain files to look it beautiful
        onClick(root.childClMain)
        onClick(root.children[0].childClMain)
    }

    override fun onClick(v: View?) {
        if (v == null) return

        Log.d(TAG, "SourceCodeActivity: onClick: called")

        var clickedItem: FileView? = null
        if (hashMap.containsKey(v.id))
            clickedItem = hashMap[v.id]

        if (clickedItem == null) return

        workWithClickedItem(clickedItem)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_source_code, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){

            android.R.id.home -> {
                finish()
            }

            R.id.menu_expand_all_source_code -> {
                expandReduce(true, root)
            }

            R.id.menu_reduce_all_source_code -> {
                expandReduce(false, root)
            }
        }

        return super.onOptionsItemSelected(item)
    }

}














