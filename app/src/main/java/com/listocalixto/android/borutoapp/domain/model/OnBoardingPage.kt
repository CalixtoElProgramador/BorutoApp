package com.listocalixto.android.borutoapp.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.listocalixto.android.borutoapp.R

sealed class OnBoardingPage(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
) {
    object Firts: OnBoardingPage(
        image = R.drawable.greetings,
        title = R.string.title_on_boarding_page_one,
        description = R.string.description_on_boarding_page_one
    )
    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = R.string.title_on_boarding_page_two,
        description = R.string.description_on_boarding_page_two
    )
    object Third: OnBoardingPage(
        image = R.drawable.power,
        title = R.string.title_on_boarding_page_three,
        description = R.string.description_on_boarding_page_three
    )
}
