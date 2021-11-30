package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public abstract class NotTeleOp extends OpMode {
    private HackHers_Lib everything;


    public void init() {
        DcMotor fL = hardwareMap.get(DcMotor.class, "fl");
        DcMotor fR = hardwareMap.get(DcMotor.class, "fR");
        DcMotor bL = hardwareMap.get(DcMotor.class, "bl");
        DcMotor bR = hardwareMap.get(DcMotor.class, "bR");
        DcMotor dw = hardwareMap.get(DcMotor.class, "dw");

        everything = new HackHers_Lib(fL, fR, bL, bR, dw);
    }
}