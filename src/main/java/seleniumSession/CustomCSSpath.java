package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomCSSpath {
	// id:
	// htmltag#id
	// eg: input#input-email
	// #id
	// #input-email

	// class:
	// htmltag.class
	// eg input.from-control
	// .class
	// eg .from-control

	// for multiple classes:
	// htmltag.class1.class2.class3
	// eg input.from-control.imput-lg

	// combine id and classname
	// htmltag#id.class or html.class1.class2.class3#id
	// eg. input#input-email.from-control

	// htmltag[attr='value']
	// input[name='email'] ---css
	// //input[@name='email'] ---xpath

	// input[name='email'][type='text'][placeholder='E-Mail Address'] this is how we
	// can write the css
	// input[id][name='email'][type='text'][placeholder='E-Mail Address'] this is
	// also correct css, even though id value is not provided.
	// input[id][name][type][placeholder] ----valid css
	// input[name='email']#input-email ---- valid CSS

	// input[placeholder*='Address']--- contains in CSS
	// input[placeholder^='E-Mail']--- Start with in CSS
	// input[placeholder$='Address'] ------End with in CSS
	// text() function is not there in CSS, which is major drawback

	// parent to child concept
	// select#Form_getForm_Country>option -- select all the direct child elements in
	// css using >
	// select#Form_getForm_Country option -- direct+indirect child elements

	// Child to parent is not available, Backward traversing is not allowed in CSS

	// Sibling concept
	// Preceding concept is not allowed in CSS
	// Following sibling is allowed in CSS:
	// label[for='input-email']+input#input-email ------ using + symbol, But + only
	// help us to provide the immediate sibling.
	// if there are more then 1 siblings please use + symbol after every sibling:
	// label[for='input-password']+input+a

	// to achieve the sibling which is not immediate
	// label[for='input-password']~a

	// indexing in css:
	// select#Form_getForm_Country>option:first-child
	// select#Form_getForm_Country>option:last-child
	// select#Form_getForm_Country>option:nth-child(16) - start counting from the
	// top
	// select#Form_getForm_Country>option:nth-last-child(4) - start counting from
	// the bottom
	// select#Form_getForm_Country>option:nth-child(even) -- all the even child
	// element
	// select#Form_getForm_Country>option:nth-child(odd) --- all the odd child
	// elements
	// select#Form_getForm_Country>option:nth-child(n+4) -- start from the 4th
	// element
	// select#Form_getForm_Country>option:nth-child(n4) --- multiplication of the
	// 4th element

	// comma in CSS: helps to create only one locater to validate verious elements
	// present
	/**
	 * By checkImpElements =
	 * By.cssSelector("input#input-email,input#input-password,input.btn,input.btn-primary");
	 * List<WebElement> impElemrntsList = driver.findElements(checkImpElements);
	 * ArrayList<String> arrayElementsList = new ArrayList<String>(); int
	 * numberOfImpElements = impElemrntsList.size(); if(numberOfImpElements == 3) {
	 * System.out.println("All importent elements are available"); for (WebElement e
	 * : impElemrntsList) {
	 * 
	 * arrayElementsList.add(e.getAttribute("type")); }
	 * System.out.println(arrayElementsList); }
	 * 
	 * else System.out.println("few elements are missing");
	 **/

}
