package com.patterns.stragegy.StimulateDuckPro.src.com.java.hexter.stimulateduck.duck;

import com.patterns.stragegy.StimulateDuckPro.src.com.java.hexter.stimulateduck.flybehavior.GoodFlyBehavior;
import com.patterns.stragegy.StimulateDuckPro.src.com.java.hexter.stimulateduck.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}