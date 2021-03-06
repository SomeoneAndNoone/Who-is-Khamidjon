package com.hamidjonhamidov.whoiskhamidjon.ui.main.contact_me.state

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ContactMeViewState(

    // messageType
    var contactType: Int = -1,

    // send message fields type
    var sendMessageFields: SendMessageFields = SendMessageFields(),

    // send email fields type
    var sendEmailFields: SendEmailFields = SendEmailFields()

) : Parcelable{

    companion object{
        val TYPE_SEND_MESSAGE = 0
        val TYPE_SEND_EMAIL = 1
    }

    @Parcelize
    data class SendMessageFields(
        var message: String? = null
    ): Parcelable

    @Parcelize
    data class SendEmailFields(
        var message: String? = null
    ): Parcelable
}

