package releasethecracken.dropp

import android.app.ListActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        val values = arrayOf("Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2")
        val adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, values)
        listAdapter = adapter
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        val item = listAdapter.getItem(position) as String
        Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show()
    }

}
