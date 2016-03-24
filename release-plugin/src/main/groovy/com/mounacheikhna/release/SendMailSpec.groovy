package com.mounacheikhna.release

/**
 * Created by m.cheikhna on 24/03/2016.
 */
interface SendMailSpec {

    void senderMail(String username)
    void senderPassword(String password)
    void destination(String destination)
    void subject(String subject)
    void body(String body)

}
