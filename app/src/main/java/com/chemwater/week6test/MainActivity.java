package com.chemwater.week6test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}



/*
1. Create a program which checks if the string has the correct order of parenthesis/brackets.
 ({})[] = true, []{]}[ = false
2. Given a string and a non-empty substring sub, compute recursively if at least n copies of sub
appear in the string somewhere, possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
 */