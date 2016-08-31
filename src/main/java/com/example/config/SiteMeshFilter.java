package com.example.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class SiteMeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/*", "/layouts/default.ftl");
		builder.setMimeTypes("text/html", "application/xhtml+xml","application/vnd.wap.xhtml+xml");
		builder.addExcludedPath("/login.html");
		builder.addExcludedPath("/api/*");
	}	
}
