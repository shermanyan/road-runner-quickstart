package org.firstinspires.ftc.teamcode.drive.opmode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.mecanum.SampleMecanumDriveBase;
import org.firstinspires.ftc.teamcode.drive.mecanum.SampleMecanumDriveREV;

/*
 * This is an example of a more complex path to really test the tuning.
 */
@Autonomous(group = "A test")
public class Test1 extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        SampleMecanumDriveBase drive = new SampleMecanumDriveREV(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;

//        drive.followTrajectorySync(
//                drive.trajectoryBuilder()
//                        .strafeLeft(strafeValue(24))
//                        .build()
//        );
//        sleep(1000);
//
//        drive.followTrajectorySync(
//                drive.trajectoryBuilder()
//                        .strafeRight(strafeValue(24))
//                        .build()
//        );
//        sleep(1000);

//
//        drive.followTrajectorySync(
//                drive.trajectoryBuilder()
//                        .splineTo(new Pose2d(0, 0, 0))
//                        .build()
//        );
//        //sleep(1000);
//
//        telemetry.addLine("1");
//        telemetry.update();
//        drive.followTrajectorySync(
//                drive.trajectoryBuilder()
//                        .splineTo(new Pose2d(24, 0, 0))
//                        .build()
//        );
//       // sleep(2000);

//        telemetry.addLine("2");
//        telemetry.update();
//
//        drive.followTrajectorySync(
//                drive.trajectoryBuilder()
//                        .splineTo(new Pose2d(24, 24, 0))
//                        .build()
//        );
        drive.followTrajectorySync(
                drive.trajectoryBuilder()
//                        .reverse()
                        .splineTo(new Pose2d(24,0,0))
                        .build()
        );

        sleep(1000);

        telemetry.addLine("1");
        telemetry.update();

        drive.followTrajectorySync(
                drive.trajectoryBuilder()
//                        .reverse()
                        .splineTo(new Pose2d(24,24,0))
                        .build()
        );

        sleep(1000);

        drive.followTrajectorySync(
                drive.trajectoryBuilder()
                        .reverse()
                        .splineTo(new Pose2d (0,0,0))
                        .build()
        );

        sleep(10000);

        telemetry.addLine("path complete");
        telemetry.update();



    }
//    private double strafeValue(double input) {
//        return (input + 11);
//    }
}
