package com.tmc.myapp;

import java.util.ArrayList;
import java.util.Random;

import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Font;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.List;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.GridLayout;

public class ShowQuotes extends Form {
	
	private final Label l1,l2;
    private final Container mainContainer;
    private final Button backBtn;
	
	public ShowQuotes() {
        this.setLayout(new BorderLayout());
        mainContainer =new Container();
        mainContainer.setLayout(new GridLayout(8,1));
        l1 = new Label("The Mood Cure");
        l1.getUnselectedStyle().setAlignment(Component.CENTER);
        l1.getUnselectedStyle().setFgColor(-16777216);
        Font l1_font = Font.createSystemFont(Font.FACE_SYSTEM, Font.STYLE_BOLD, Font.SIZE_LARGE);
        l1.getUnselectedStyle().setFont(l1_font);
        l2 = new Label(happyQuotes());
        backBtn= new Button("Back");
        backBtn.getUnselectedStyle().setFgColor(5542241);
        
        backBtn.addActionListener((ActionListener) (ActionEvent evt) -> {
            MyApplication.hi.show();
        });
        
        mainContainer.add(l1);
        mainContainer.add(new Label());
        mainContainer.add(l2);
        mainContainer.add(new Label());
        mainContainer.add(backBtn);
        this.add(BorderLayout.NORTH, mainContainer);				
	}
	
	public String happyQuotes() {
		Random r = new Random();
		ArrayList<String> happyQuotes = new ArrayList<String>();
		happyQuotes.add("The pursuit of happiness.");
		happyQuotes.add("Be happy.");
		happyQuotes.add("God Loves You.");
		happyQuotes.add("Living is happiness.");
		happyQuotes.add("Everything will get better.");
		return happyQuotes.get(r.nextInt(5));
	}
	

}
