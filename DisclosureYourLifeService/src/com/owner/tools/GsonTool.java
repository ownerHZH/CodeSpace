package com.owner.tools;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.owner.domain.Consume;
import com.owner.domain.Embarrass;
import com.owner.domain.Income;

public class GsonTool {
	 public static Gson getGson() {
			GsonBuilder gsonBuilder = new GsonBuilder();
			// gsonBuilder.excludeFieldsWithoutExposeAnnotation();
			return gsonBuilder.setDateFormat("yyyy/MM/dd HH:mm:ss").create();
		}
	 
	public static Type type_consumeList = new TypeToken<List<Consume>>() {
	}.getType();
	public static Type type_incomeList = new TypeToken<List<Income>>() {
	}.getType();
	public static Type type_embarrassList = new TypeToken<List<Embarrass>>() {
	}.getType();
	public static Type type_embarrass = new TypeToken<Embarrass>() {
	}.getType();
}
