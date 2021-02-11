package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
@TeleOp (name = "jakeIsDaBest", group = "Random")
public class forFun extends OpMode {

    private Servo Dyaln;
    private Servo gabDaBilder;
    private DcMotor theFeds;
    private DcMotor gabDaDumDum;
    private DcMotor jake;
    private DcMotor sandrosBrother;
    private double jaob = 0.34;
    private double imSoTired = 0.0;
    private double freeRealEstate = 0.32;
    private double zero = 0.0;
    // private can change later



    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");
        //hardware map iz annoying
        Dyaln = hardwareMap.get(Servo.class, "Dyaln");
        gabDaBilder = hardwareMap.get(Servo.class, "gabDaBilder");
        theFeds = hardwareMap.get(DcMotor.class, "theFeds");
        gabDaDumDum = hardwareMap.get(DcMotor.class, "gabDaDumDum");
        jake = hardwareMap.get(DcMotor.class, "jake");
        sandrosBrother = hardwareMap.get(DcMotor.class, "sandrosBrothers");



    }
    @Override
    public void loop() {
        if (gamepad1.a) {
            Dyaln.setPosition(jaob);
        } else {
            Dyaln.setPosition(imSoTired);

            if (gamepad1.x) {
                gabDaBilder.setPosition(freeRealEstate);
            } else {
                gabDaBilder.setPosition(zero);
            }
            double topLeftPower;
            double topRightPower;
            double bottomLeftPower;
            double bottomRightPower;
            double drive = -gamepad1.left_stick_y;
            double turn =  gamepad1.left_stick_x;
            double strafe = gamepad1.right_stick_x;
            topLeftPower = Range.clip(drive + turn + strafe, -1.0, 1.0) ;
            topRightPower   = Range.clip(-drive + turn + strafe, -1.0, 1.0) ;
            bottomLeftPower = Range.clip(drive + turn - strafe, -1.0, 1.0);
            bottomRightPower = Range.clip(-drive + turn - strafe,-1.0, 1.0 );
//            topLeftDrive.setPower(topLeftPower);
//            topRightDrive.setPower(topRightPower);
//            bottomLeftDrive.setPower(bottomLeftPower);
//            bottomRightDrive.setPower(bottomRightPower);

        }
    }
}












