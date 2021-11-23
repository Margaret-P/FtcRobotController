package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class NotTeleOp extends OpMode {
    private HackHers_Lib everything;


    public void init() {
        DcMotor fL = hardwareMap.get(DcMotor.class, "fl");
        DcMotor fR = hardwareMap.get(DcMotor.class, "fR");
        DcMotor bL = hardwareMap.get(DcMotor.class, "bl");
        DcMotor bR = hardwareMap.get(DcMotor.class, "bR");
        DcMotor dw = hardwareMap.get(DcMotor.class, "dw")

        everything = new HackHers_Lib(fL, fR, bL, bR, dw);
    }

    @Override
    public void loop() {
        everything.omniDrive(gamepad1.right_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
    }

}
