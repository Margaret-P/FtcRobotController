package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public abstract class NotTeleOp extends OpMode {
    private HackHers_Lib everything;
    DcMotor fL = hardwareMap.get(DcMotor.class, "fl");
    DcMotor fR = hardwareMap.get(DcMotor.class, "fR");
    DcMotor bL = hardwareMap.get(DcMotor.class, "bl");
    DcMotor bR = hardwareMap.get(DcMotor.class, "bR");
    DcMotor dw = hardwareMap.get(DcMotor.class, "dw");

    public void init() {

        everything = new HackHers_Lib(fL, fR, bL, bR, dw);
    }

    @Override
    public void loop() {
        everything.omniDrive(gamepad1.right_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
        if(gamepad1.a){
            everything.setMotorPower(dw, 1);
        }
    }

}