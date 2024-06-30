package seleniumSession;

public class customXpath {

	public static void main(String[] args) {

		// xPath: is not an attribute, it's an address of an element in the html dump.
		// there are two types of xPath is present:
		// 1. Absolute xpath: Absolute address of the element of the top; Right click on
		// the html tag and we can copy the full xpath
		// 2. relative xpath/custom xpath
		// formula
		// xpath axes: Relationship: parent,child,siblings
		// functions

		// formula of the custom xpath
		// //htmltag[@attr='value']
		// //htmltag[@attr='value' and @attr1='value' and @attr2='value']
		// //htmltag[@attr='value'and @attr1 and @attr2='value']
		// //htmltag[@attr and @attr1]
		// //htmltag[@attr]
		// //htmltag

		// with the or also we can define the xpath, in that case either one condition
		// will be satisfied to show the count of elements.
		//// htmltag[@attr='value'or @attr1]

		// for any html tag which does not have any attribute present also which has
		// text present :
		// text()----function is xpath;
		// //htmltag[text() ='arg']
		// //legend[text()='Your personal Details']

		// contains()----function is xpath;
		// //htmltag[contains(@attr,'value')]
		// //htmltag[contains(@attr,'value') and @attr2='value']
		// //htmltag[contains(@attr='value')]------wrong xpath
		// //htmltag[contains(@attr,'value') and contains(@attr1,'value')]
		// for the dynamic element with attribute we can use use contains()

		// use of test() and contains() together
		// //htmltag[contains(text(),'value')]
		// //htmltag[contains(text(),'value')and @attr='value']

		// start-with() - function
		// //html[start-with(@attr,'value')]

		// Indexing in xpath
		// capture group: we need to keep all the elements inside the capture group--
		// using the ();then provide the index number [num], number start with 1
		// (//a[text()='Forgotten Password'])[1]
		// (//htmltag[@id])[2]

		// position() --- function
		// (//htmltag[@id])[position()=1]

		// last() ---function
		/// (//htmltag[@id])[last()]
		/// (//htmltag[@id])[last()-1]
		/// (//htmltag[@id])[last()-3]
		/// (//htmltag[@id])[last()-last()+3]

		// ((//div[@class='navFooterVerticalColumn
		// navAccessibility']//div[@class='navFooterLinkCol
		// navAccessibility'])[last()]//a)[last()]

		// in the label element which contains initial/after space it will not consider
		// as a xpath: //lavel[@text()=' Yes'], in this case we can
		// use normalize-space() function: //label[normalize-space()='Yes']

		// xpath Axes
		// it is about the relationship between parent,child,siblings and grandparent
		// for direct child = /
		// for direct+indirect child =//

		// reverse traversing:
		// Child to parent
		// Child to Grand parent

		// e.g: //input[@id='input-email']/../../.. -----> using /.. we can achive
		// reverse traversing.
		// for the immediate parent we can use:
		// //option[@value='Australia']/parent::select
		//// option[@value='Australia']/parent::select/parent::div -----> this way we
		// can go till top of the hierarchy
		// for the grand parent :
		// //option[@value='Australia']/ancestor::div[@class='middleColumn']

		// There are two types of siblings
		// 1.Following sibling : towards the upward direction
		// 2.Preceding Sibling : towards the down/backward direction :
		// e.g:
		// //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// or
		// a[text()='Joe.Root']/parent::td/ancestor::tr//input[@type='checkbox']

		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =1] it gives
		// the odd numbers of the child elements
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =0] it gives
		// the even numbers of the child elements

	}

}
