package com.project.segunfrancis.mergeadaptersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.MergeAdapter
import com.project.segunfrancis.mergeadaptersample.datasource.DataSource.getBanner
import com.project.segunfrancis.mergeadaptersample.datasource.DataSource.getUser
import com.project.segunfrancis.mergeadaptersample.dto.MyDetail
import com.project.segunfrancis.mergeadaptersample.recycleradapters.BannerAdapter
import com.project.segunfrancis.mergeadaptersample.recycleradapters.MyDetailAdapter
import com.project.segunfrancis.mergeadaptersample.recycleradapters.UsersAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MergeAdapter
    private lateinit var myDetailAdapter: MyDetailAdapter
    private lateinit var userVerticalAdapter: UsersAdapter
    private lateinit var bannerAdapter: BannerAdapter
    private val myDetail = MyDetail(1, "Segun Francis", "I am an android engineer and a technical writer")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupDataInRecyclerView()
    }

    private fun setupDataInRecyclerView() {
        userVerticalAdapter = UsersAdapter(getUser())
        bannerAdapter = BannerAdapter(getBanner())
        myDetailAdapter = MyDetailAdapter(myDetail)
        adapter = MergeAdapter(myDetailAdapter, userVerticalAdapter, bannerAdapter)
        merge_recyclerView.adapter = adapter
    }
}
