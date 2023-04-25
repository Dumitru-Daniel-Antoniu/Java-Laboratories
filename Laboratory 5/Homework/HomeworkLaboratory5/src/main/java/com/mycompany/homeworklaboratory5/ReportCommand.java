package com.mycompany.homeworklaboratory5;

import java.io.*;
import org.apache.velocity.*;
import org.apache.velocity.app.*;

public class ReportCommand implements CommandClass {
    @Override
    public void doCommand(Catalog catalog, Document document, String path) throws IOException {
        Velocity.setProperty("resource.loader", "class");
        Velocity.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init();
        Template template = Velocity.getTemplate("./src/HTMLdocument.vm");
        VelocityContext context = new VelocityContext();
        context.internalPut("documents", catalog);
        Writer report = new StringWriter();
        template.merge(context, report);
        System.out.println(report);
    }
}
