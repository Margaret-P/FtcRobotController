package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class HackHers_Lib {
    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;
    public DcMotor duckWheel;

    public HackHers_Lib(DcMotor fl, DcMotor fr, DcMotor bl, DcMotor br, DcMotor dw){
            this.frontLeft= fl;
            this.frontRight = fr;
            this.backLeft= bl;
            this.backRight = br;
            this.duckWheel = dw;
        }

        public void driveRaw(float fl, float fr, float bl, float br){
            frontLeft.setPower(fl);
            frontRight.setPower(fr);
            backLeft.setPower(bl);
            backRight.setPower(br);
    }
    public void setMotorPower(DcMotor motor, float power){
        motor.setPower(power);
    }

    public void omniDrive(float v, float h, float r){
        float[] sum = PaulMath.omniCalc(v, h, r);
        driveRaw(sum[0], sum[1], sum[2], sum[3]);
    }


}

