package week3.day2;

	// Base Class: WebElement
	class WebElement {
	    public void click() {
	        System.out.println("Element clicked.");
	    }

	    public void setText(String text) {
	        System.out.println("Text set to: " + text);
	    }
	}

	// Subclass: Button
	class Button extends WebElement {
	    public void submit() {
	        System.out.println("Button submitted.");
	    }
	}

	// Subclass: TextField
	class TextField extends WebElement {
	    private String text;

	    public void getText() {
	        System.out.println("Text in field: " + text);
	    }

	    @Override
	    public void setText(String text) {
	        this.text = text;
	        super.setText(text);
	    }
	}

	// Subclass: CheckBoxButton inheriting from Button
	class CheckBoxButton extends Button {
	    public void clickCheckButton() {
	        System.out.println("CheckBox button clicked.");
	    }
	}

	// Subclass: RadioButton inheriting from Button
	class RadioButton extends Button {
	    public void selectRadioButton() {
	        System.out.println("Radio button selected.");
	    }
	}

	// Execution Class: Elements
	public class Elements {
	    public static void main(String[] args) {
	        // Create objects for each class and call methods

	        // WebElement object
	        WebElement element = new WebElement();
	        element.click();

	        // Button object
	        Button button = new Button();
	        button.click();
	        button.submit();

	        // TextField object
	        TextField textField = new TextField();
	        textField.setText("Hello, world!");
	        textField.getText();

	        // CheckBoxButton object
	        CheckBoxButton checkBoxButton = new CheckBoxButton();
	        checkBoxButton.click();
	        checkBoxButton.clickCheckButton();

	        // RadioButton object
	        RadioButton radioButton = new RadioButton();
	        radioButton.click();
	        radioButton.selectRadioButton();
	    }
	}


