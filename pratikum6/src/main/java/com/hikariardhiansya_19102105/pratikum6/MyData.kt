package com.hikariardhiansya_19102105.pratikum6

import android.os.Parcelable
import kotlinx.android.parcel.Percelize


class MyData {

    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String
    ) : Parcelable

}