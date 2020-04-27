package com.project.segunfrancis.mergeadaptersample.datasource

import com.project.segunfrancis.mergeadaptersample.R
import com.project.segunfrancis.mergeadaptersample.dto.Banner
import com.project.segunfrancis.mergeadaptersample.dto.User

/**
 * Created by SegunFrancis
 */
object DataSource {
    fun getUser() = ArrayList<User>().apply {
        add(
            User(
                1,
                "Himanshu",
                "https://s3.amazonaws.com/uifaces/faces/twitter/sunlandictwin/128.jpg"
            )
        )
        add(
            User(
                2,
                "Alford Hoeger",
                "https://s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"
            )
        )
        add(
            User(
                3,
                "Terrance Halvorson",
                "https://s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"
            )
        )
        add(
            User(
                3,
                "Morgan McGlynn",
                "https://s3.amazonaws.com/uifaces/faces/twitter/allfordesign/128.jpg"
            )
        )
        add(
            User(
                4,
                "Ms. Ramiro DuBuque",
                "https://s3.amazonaws.com/uifaces/faces/twitter/shaneIxD/128.jpg"
            )
        )
        add(
            User(
                5,
                "Kolby Orn",
                "https://s3.amazonaws.com/uifaces/faces/twitter/johnsmithagency/128.jpg"
            )
        )
        add(
            User(
                6,
                "Elijah Schoen MD",
                "https://s3.amazonaws.com/uifaces/faces/twitter/alxndrustinov/128.jpg"
            )
        )
        add(
            User(
                7,
                "Alford Hoeger",
                "https://s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"
            )
        )
        add(
            User(
                8,
                "Himanshu",
                "https://s3.amazonaws.com/uifaces/faces/twitter/sunlandictwin/128.jpg"
            )
        )
        add(
            User(
                9,
                "Ms. Ramiro DuBuque",
                "https://s3.amazonaws.com/uifaces/faces/twitter/shaneIxD/128.jpg"
            )
        )
        add(
            User(
                10,
                "Elijah Schoen MD",
                "https://s3.amazonaws.com/uifaces/faces/twitter/alxndrustinov/128.jpg"
            )
        )
        add(
            User(
                11,
                "Kolby Orn",
                "https://s3.amazonaws.com/uifaces/faces/twitter/johnsmithagency/128.jpg"
            )
        )
        add(
            User(
                12,
                "Morgan McGlynn",
                "https://s3.amazonaws.com/uifaces/faces/twitter/allfordesign/128.jpg"
            )
        )
    }

    fun getBanner() = Banner(R.drawable.publication_site_cover)
}