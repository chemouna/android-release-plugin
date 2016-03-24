package com.mounacheikhna.release

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by m.cheikhna on 24/03/2016.
 */
class ExecWait extends DefaultTask {
    String command
    String ready
    String directory
    String separator = " "

    @TaskAction
    def spawnProcess() {
        ProcessBuilder builder = new ProcessBuilder(command.split(separator))
        builder.redirectErrorStream(true)
        builder.directory(new File(directory))
        Process process = builder.start()

        InputStream stdout = process.getInputStream()
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout))

        def line
        while ((line = reader.readLine()) != null) {
            println line
            if (line.contains(ready)) {
                println "$command is ready"
                break;
            }
        }
    }
}