package com.mt.testplugin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import com.mt.minicraft.BaseAPI;
import com.mt.minicraft.util.Callback;

public class TestPlugin implements BaseAPI{

	@Override
	public void preInit(Object gameClass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit(Object gameClass) {
		try {
			Field menuField = gameClass.getClass().getDeclaredField("menu");
			Object menuClass = menuField.get(gameClass);
			if(menuClass.getClass().getSimpleName().equalsIgnoreCase("TitleMenu")) {
				Field menuTitlesField = menuClass.getClass().getDeclaredField("titles");
				menuTitlesField.setAccessible(true);
				
				Field menuOptionsField = menuClass.getClass().getDeclaredField("options");
				menuOptionsField.setAccessible(true);
				
				Object menuTitles = menuTitlesField.get(menuClass);
				Object menuOptions = menuOptionsField.get(menuClass);
				
				ArrayList<String> titles = (ArrayList<String>) menuTitles;
				ArrayList<Callback> options = (ArrayList<Callback>) menuOptions;
				
				titles.add("Quit");
				options.add(() -> System.exit(0));
				
			}
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
