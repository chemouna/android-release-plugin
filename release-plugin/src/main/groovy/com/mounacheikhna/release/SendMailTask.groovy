
package com.mounacheikhna.release

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by m.cheikhna on 22/03/2016.
 */
class SendMailTask extends DefaultTask implements SendMailSpec {

    private String senderMail
    private String password
    private String destination
    private String subject
    private String body

    @TaskAction
    void performTask() {
        def mailParams = [
                mailhost       : "smtp.gmail.com",
                mailport       : "465",
                subject        : subject,
                messagemimetype: "text/plain",
                user           : senderMail,
                password       : password,
                enableStartTLS : "true",
                ssl            : "true"
        ]

        println 'Mail Sending Start..'

        ant.mail(mailParams) {
            from(address: 'my-email')
            to(address: destination) //TODO: test with a list of destination
            message(body)
        }
    }

    @Override
    void senderMail(String username) {
        this.senderMail = username
    }

    @Override
    void senderPassword(String password) {
        this.password = password
    }

    @Override
    void destination(String destination) {
        this.destination = destination
    }

    @Override
    void subject(String subject) {
        this.subject = subject
    }

    @Override
    void body(String body) {
        this.body = body
    }
}
