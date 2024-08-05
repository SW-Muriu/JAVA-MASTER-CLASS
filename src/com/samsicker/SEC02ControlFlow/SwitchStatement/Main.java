package com.samsicker.SEC02ControlFlow.SwitchStatement;

import com.samsicker.SEC01JavaBasics.HelloWorld.CommonParamsInput;

public class Main {
    public static void main(String[] args) {

        Switch switch0x01 = new Switch();
        CommonParamsInput commonParamsInput = new CommonParamsInput();

        int [] inputParams = commonParamsInput.variablesInput();
        switch0x01.firstExample(inputParams[0]);

        switch0x01.getQuarter("january");

    }
}
