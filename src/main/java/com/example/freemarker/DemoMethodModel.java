package com.example.freemarker;

import com.google.common.collect.Lists;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.util.List;

/**
 * Created by Rocky on 2016-9-4.
 */
public class DemoMethodModel implements TemplateMethodModelEx {


    @Override
    public Object exec(List list) throws TemplateModelException {
        return Lists.newArrayList("Rocky","Merlin");
    }
}
