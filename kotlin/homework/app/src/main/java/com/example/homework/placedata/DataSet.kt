package com.example.homework.placedata

import com.example.homework.R

class DataSet  {
    fun makeSet() : List<Affirmation> {
        return listOf<Affirmation>(Affirmation(R.string.affirmation1, R.drawable.chiba),
            Affirmation(R.string.affirmation2, R.drawable.hukuoka),
            Affirmation(R.string.affirmation3, R.drawable.kyoto),
            Affirmation(R.string.affirmation4, R.drawable.okinawa),
            Affirmation(R.string.affirmation5, R.drawable.osaka),
            Affirmation(R.string.affirmation6, R.drawable.osakacastle),
            Affirmation(R.string.affirmation7, R.drawable.satporo),
            Affirmation(R.string.affirmation8, R.drawable.univer))
    }

    fun makeSetDetail() : List<AffirmationDetail> {
        return listOf<AffirmationDetail>(AffirmationDetail(R.string.affirmation9, R.drawable.chiba),
            AffirmationDetail(R.string.affirmation10, R.drawable.hukuoka),
            AffirmationDetail(R.string.affirmation11, R.drawable.kyoto),
            AffirmationDetail(R.string.affirmation12, R.drawable.okinawa),
            AffirmationDetail(R.string.affirmation13, R.drawable.osaka),
            AffirmationDetail(R.string.affirmation14, R.drawable.osakacastle),
            AffirmationDetail(R.string.affirmation15, R.drawable.satporo),
            AffirmationDetail(R.string.affirmation16, R.drawable.univer))
    }
}
