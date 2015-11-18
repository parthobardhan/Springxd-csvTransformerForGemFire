package io.pivotal.edu.spring.xd;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class CSVToJson2 {
	public Message<?> translate(Message<?> message) throws ParseException {
		Message<?> result = message;
		String payload = (String) message.getPayload();
		String[] info = payload.split("\\t");
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		if (info != null && info.length != 0) {
			MBE mbe = new MBE();
			mbe.setOdsGenkey(Integer.parseInt(info[0]));
			mbe.setSourcePlatform(info[1]);
//			mbe.setSourcePID(Long.parseLong(info[2]));
			mbe.setCopayLevelCode(info[3]);
			mbe.setEffectiveDate3(formatter.parse(info[4]));
			mbe.setEndDate1(formatter.parse(info[5]));
			mbe.setProdPlanId(info[6]);
			mbe.setLongTermCareProvideCode(info[7]);
			mbe.setProductId(info[8]);
			mbe.setOfferid(info[9]);
			mbe.setAlternateDescription(info[10]);
			mbe.setDescription1(info[11]);
			mbe.setProductStartDate(formatter.parse(info[12]));
			mbe.setProductEndDate(formatter.parse(info[13]));
			mbe.setProductTypeCode(info[14]);
			mbe.setMajorLineOfBusiness(info[15]);
			mbe.setProductLine(info[16]);
			mbe.setProductLIneCode(info[17]);
			mbe.setSegmentType(info[18]);
			mbe.setLegaLEntityId(info[19]);
			mbe.setIsFedQualified(info[20]);
			mbe.setIsCustomePlan(info[21]);
			mbe.setPersonalCareAccountIndicator(info[22]);
			mbe.setIsPcpRequired(info[23]);
			mbe.setIsRxMedicalIntegratedDeductibleIndicator(info[24]);
			mbe.setDeductibleTypeCode(info[25]);
			mbe.setIsCarryOverCredit(info[26]);
			mbe.setIsCustomerCarveOutIndicator(info[27]);
			mbe.setPcaDeductibleTypeCode(info[28]);
			mbe.setIsRxSpecialityIndicator(info[29]);
			mbe.setOracleProductNumber(info[30]);
			mbe.setIsSelfPay(info[31]);
			mbe.setProductMasterId(info[32]);
			mbe.setProductOptionKey(info[33]);
			mbe.setMarketNumber(info[34]);
			mbe.setEffectiveDate4(formatter.parse(info[35]));
			mbe.setName(info[36]);
			mbe.setNpiSourceProviderKey(info[37]);
			mbe.setSourceProviderKey(info[38]);
			mbe.setCarrierName(info[39]);
			mbe.setEffectiveDate1(formatter.parse(info[40]));
			mbe.setEndDate2(formatter.parse(info[41]));
			mbe.setPrimary1(info[42]);
			mbe.setProductRoleType(info[43]);
			mbe.setRelationshipToSubscriber(info[44]);
			mbe.setNumberOfSessions(Integer.parseInt(info[45]));
			mbe.setStartDate1(formatter.parse(info[46]));
			mbe.setEndDate3(formatter.parse(info[47]));
			mbe.setCoverageType(info[48]);
			mbe.setModifiedDate1(info[49]);
			mbe.setPediatricDentalTermdate(info[50]);
			mbe.setCommentText(info[51]);
			mbe.setNetworkId(Integer.parseInt(info[52]));
			mbe.setActionTimestamp(info[53]);
			mbe.setDirectoryId(Integer.parseInt(info[54]));
			mbe.setDisplayName(info[55]);
			mbe.setFormNumber(info[56]);
			mbe.setPrimary2(info[57]);
			mbe.setServiceCategoryId(info[58]);
			mbe.setWaitBeginDate(formatter.parse(info[59]));
			mbe.setWaitEndDate(formatter.parse(info[60]));
			mbe.setWaitTypeCode(info[61]);
			mbe.setAmount1(info[62]);
			mbe.setCsrLevel(info[63]);
			mbe.setStartDate2(formatter.parse(info[64]));
			mbe.setEndDate4(formatter.parse(info[65]));
			mbe.setModifiedDate(formatter.parse(info[66]));
			mbe.setAmount(Integer.parseInt(info[67]));
			mbe.setEffectiveDate2(formatter.parse(info[68]));
			mbe.setEndDate5(formatter.parse(info[69]));
			mbe.setIndividualAmount(Integer.parseInt(info[70]));
			mbe.setPremiumAmount(Integer.parseInt(info[71]));
			mbe.setSeqNumber(Integer.parseInt(info[72]));
			mbe.setOtherAmount1(Integer.parseInt(info[73]));
			mbe.setOtherAmount2(Integer.parseInt(info[74]));
			mbe.setOtherAmount3(Integer.parseInt(info[75]));
			mbe.setOtherAmount4(Integer.parseInt(info[76]));
			mbe.setBegindate(formatter.parse(info[77]));
			mbe.setEndDate6(formatter.parse(info[78]));
			mbe.setMaximumLimit(info[79]);
			mbe.setPeriodUtilizationPeriod(info[80]);
			mbe.setCode(info[81]);
			mbe.setDescription(info[82]);
			mbe.setType(info[83]);
			result = MessageBuilder.withPayload(mbe).copyHeadersIfAbsent(message.getHeaders())
					.setHeaderIfAbsent("gemfireKey", info[2]).build();
		} else {
			throw new RuntimeException("can not process payload");
		}
		return result;
	}
}
