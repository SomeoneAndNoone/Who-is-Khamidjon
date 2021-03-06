package com.hamidjonhamidov.whoiskhamidjon.ui.main.skills.state

import android.os.Parcelable
import com.hamidjonhamidov.whoiskhamidjon.models.skills.SkillModel
import kotlinx.android.parcel.Parcelize

@Parcelize
class SkillsViewState(

    // this is for SkillsListFragment
    var skillsListFields: SkillsListFields = SkillsListFields(),

    // this is for SkillsDetails fragment
    var currentSelectedItemPosition: Int = 0

) : Parcelable {

    @Parcelize
    data class SkillsListFields(
        var skillsList: List<SkillModel>? = null,
        var skillPositionInView: Int = 0
    ) : Parcelable
}