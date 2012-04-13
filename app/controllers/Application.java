package controllers;

import java.text.DecimalFormat;

import models.DataStore;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	/**
	 * Home page
	 * @return
	 */
	public static Result index() {
		DataStore ds = new DataStore();
		String defaultStartDate = new String("2012-01-01");
		String defaultEndDate = new String("2999-12-31");
		String walmartDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.WALMAERCOM);
		String pangaeaDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.PANGAEA);
		String devDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.DEV);
		String qaDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.QA);
		String pqaDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.PQA);
		String prodDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.PROD);
		String releaseDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.RELEASE);
		String applicationDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.APPLICATION);
		String platformDur = ds.getDuration(defaultStartDate, defaultEndDate, SqlInfo.PLATFORM);
		String infrastructureDur = ds.getDuration(defaultStartDate, defaultEndDate,
				SqlInfo.INFRASTRUCTURE);
		System.out.println(infrastructureDur);
		return ok(index.render(walmartDur, pangaeaDur, devDur, qaDur, pqaDur, prodDur, releaseDur, applicationDur,
				platformDur, infrastructureDur, defaultStartDate, defaultEndDate));
	}

	/**
	 * get duration data from startDate to endDate
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Result jiraData(String startDate, String endDate) {
		DataStore ds = new DataStore();
		String walmartDur = ds.getDuration(startDate, endDate, SqlInfo.WALMAERCOM);
		String pangaeaDur = ds.getDuration(startDate, endDate, SqlInfo.PANGAEA);
		String devDur = ds.getDuration(startDate, endDate, SqlInfo.DEV);
		String qaDur = ds.getDuration(startDate, endDate, SqlInfo.QA);
		String pqaDur = ds.getDuration(startDate, endDate, SqlInfo.PQA);
		String prodDur = ds.getDuration(startDate, endDate, SqlInfo.PROD);
		String releaseDur = ds.getDuration(startDate, endDate, SqlInfo.RELEASE);
		String applicationDur = ds.getDuration(startDate, endDate, SqlInfo.APPLICATION);
		String platformDur = ds.getDuration(startDate, endDate, SqlInfo.PLATFORM);
		String infrastructureDur = ds.getDuration(startDate, endDate, SqlInfo.INFRASTRUCTURE);
		return ok(index.render(walmartDur, pangaeaDur, devDur, qaDur, pqaDur, prodDur, releaseDur, applicationDur,
				platformDur, infrastructureDur, startDate, endDate));
	}

	/**
	 * web service, return json type data
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Result getJson(String startDate, String endDate) {
		DataStore ds = new DataStore();
		String walmartDur = ds.getDuration(startDate, endDate, SqlInfo.WALMAERCOM);
		String pangaeaDur = ds.getDuration(startDate, endDate, SqlInfo.PANGAEA);
		String devDur = ds.getDuration(startDate, endDate, SqlInfo.DEV);
		String qaDur = ds.getDuration(startDate, endDate, SqlInfo.QA);
		String pqaDur = ds.getDuration(startDate, endDate, SqlInfo.PQA);
		String prodDur = ds.getDuration(startDate, endDate, SqlInfo.PROD);
		String releaseDur = ds.getDuration(startDate, endDate, SqlInfo.RELEASE);
		String applicationDur = ds.getDuration(startDate, endDate, SqlInfo.APPLICATION);
		String platformDur = ds.getDuration(startDate, endDate, SqlInfo.PLATFORM);
		String infrastructureDur = ds.getDuration(startDate, endDate, SqlInfo.INFRASTRUCTURE);
		String jsonString = "{walmartCom:" + walmartDur + "," + "pangaea:\"" + pangaeaDur + "\","
				+ "dev:\"" + devDur + "\"," + "qa:\"" + qaDur + "\"," + "pqa:\"" + pqaDur + "\","
				+ "prod:\"" + prodDur + "," + "release:\"" + releaseDur + "\"," + "application:\"" + applicationDur + "\"," + "platform:\""
				+ platformDur + "\"," + "infrastructure:\"" + infrastructureDur + "\"," + "startDate:\""
				+ startDate + "\"," + "endDate:\"" + endDate + "\"}";
		Result jsonResult = ok(jsonString);
		return jsonResult;
	}

	/**
	 * Calculate two argument percentage
	 * Formula: a / (a + b)
	 * @param a
	 * @param b
	 * @return
	 */
	public static String percenTwoArgu(String a, String b) {
		Double dblA = Double.parseDouble(a);
		Double dblB = Double.parseDouble(b);
		Double sumAB = dblA + dblB;
		if (sumAB == 0.0) {
			return "0";
		} else {
			Double result = dblA / sumAB * 100;
			DecimalFormat twoDForm = new DecimalFormat("#.#");
			return Double.toString(Double.valueOf(twoDForm.format(result)));
		}
	}

	/**
	 * Calculate three argument percentage
	 * Formula: a / (a + b + c)
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static String percenThreeArgu(String a, String b, String c) {
		Double dblA = Double.parseDouble(a);
		Double dblB = Double.parseDouble(b);
		Double dblC = Double.parseDouble(c);
		Double sumABC = dblA + dblB + dblC;
		if (sumABC == 0.0) {
			return "0";
		} else {
			Double result = dblA / sumABC * 100;
			DecimalFormat twoDForm = new DecimalFormat("#.#");
			return Double.toString(Double.valueOf(twoDForm.format(result)));
		}
	}

	/**
	 * Calculate four argument percentage
	 * Formula: a / (a + b + c + d)
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	public static String percenFourArgu(String a, String b, String c, String d) {
		Double dblA = Double.parseDouble(a);
		Double dblB = Double.parseDouble(b);
		Double dblC = Double.parseDouble(c);
		Double dblD = Double.parseDouble(d);
		Double sumABCD = dblA + dblB + dblC + dblD;
		if (sumABCD == 0.0) {
			return "0";
		} else {
			Double result = dblA / sumABCD * 100;
			DecimalFormat twoDForm = new DecimalFormat("#.#");
			return Double.toString(Double.valueOf(twoDForm.format(result)));
		}
	}
	
	public static String percenFiveArgu(String a, String b, String c, String d, String e) {
		Double dblA = Double.parseDouble(a);
		Double dblB = Double.parseDouble(b);
		Double dblC = Double.parseDouble(c);
		Double dblD = Double.parseDouble(d);
		Double dblE = Double.parseDouble(e);
		Double sumABCDE = dblA + dblB + dblC + dblD + dblE;
		if (sumABCDE == 0.0) {
			return "0";
		} else {
			Double result = dblA / sumABCDE * 100;
			DecimalFormat twoDForm = new DecimalFormat("#.#");
			return Double.toString(Double.valueOf(twoDForm.format(result)));
		}
	}

	/**
	 * Get env duration under specified track from startDate to endDate
	 * @param startDate
	 * @param endDate
	 * @param track
	 * @param env
	 * @return
	 */
	public static String getTrackEnv(String startDate, String endDate, String track, String env) {
		return new DataStore().getTrackEnv(startDate, endDate, track, env);
	}
	
	/**
	 * Calculate @WalmartCom_Dev_Time / (@ WalmartCom_Time + @Pangaea_Time)
	 * @param startDate
	 * @param endDate
	 * @param track
	 * @param env
	 * @return
	 */
	public static String getTrackSubPer(String startDate, String endDate, String track, String env) {
		DataStore ds = new DataStore();
		Double trackEnvDur = Double.parseDouble(ds.getTrackEnv(startDate, endDate, track, env));
		Double walmartDur = Double.parseDouble(ds.getDuration(startDate, endDate, SqlInfo.WALMAERCOM));
		Double pangaeaDur = Double.parseDouble(ds.getDuration(startDate, endDate, SqlInfo.PANGAEA));
		Double sum = walmartDur + pangaeaDur;
		if(sum == 0.0){
			return "0";
		} else {
			Double result = trackEnvDur / sum * 100;
			DecimalFormat twoDForm = new DecimalFormat("#.#");
			return Double.toString(Double.valueOf(twoDForm.format(result)));
		}
	}
} 