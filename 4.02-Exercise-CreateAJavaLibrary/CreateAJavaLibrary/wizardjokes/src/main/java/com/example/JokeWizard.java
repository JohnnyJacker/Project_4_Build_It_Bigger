package com.example;

public class JokeWizard {

    public String tellAWizardJoke() {
        JokeSmith myJokeSmith = new JokeSmith();
        return "\n A Wizard says \n \n" + myJokeSmith.tellAHandCraftedJoke();
    }

}
