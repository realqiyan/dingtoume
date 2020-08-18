package me.dingtou.domain.dto;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import me.dingtou.domain.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class UserFundGroupData {

    private UserInfo userInfo;
    private List<UserFundGroup> userFundGroupList;
    private List<FundGroupDetail> fundGroupDetailList;
    private List<FundOrder> fundOrderList;
    private List<FundInfo> fundInfoList;
    private List<TradeCalendar> tradeCalendarList;

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserFundGroupList(List<UserFundGroup> userFundGroupList) {
        this.userFundGroupList = userFundGroupList;
    }

    public List<UserFundGroup> getUserFundGroupList() {
        return userFundGroupList;
    }

    public void setFundGroupDetailList(List<FundGroupDetail> fundGroupDetailList) {
        this.fundGroupDetailList = fundGroupDetailList;
    }

    public List<FundGroupDetail> getFundGroupDetailList() {
        return fundGroupDetailList;
    }

    public void setFundOrderList(List<FundOrder> fundOrderList) {
        this.fundOrderList = fundOrderList;
    }

    public List<FundOrder> getFundOrderList() {
        return fundOrderList;
    }

    public void setFundInfoList(List<FundInfo> fundInfoList) {
        this.fundInfoList = fundInfoList;
    }

    public List<FundInfo> getFundInfoList() {
        return fundInfoList;
    }

    public void setTradeCalendarList(List<TradeCalendar> tradeCalendarList) {
        this.tradeCalendarList = tradeCalendarList;
    }

    public List<TradeCalendar> getTradeCalendarList() {
        return tradeCalendarList;
    }

    /**
     * @param data 待解压缩的base64字符串串
     * @return
     * @throws IOException
     */
    public static UserFundGroupData uncompress(String data) throws IOException {
        byte[] decode = Base64.getDecoder().decode(data);
        Inflater inflater = new Inflater();
        inflater.setInput(decode);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] outByte = new byte[256];
        try {
            int len = 0;
            while (!inflater.finished()) {
                len = inflater.inflate(outByte);
                if (len == 0) {
                    break;
                }
                bos.write(outByte, 0, len);
            }
            inflater.end();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bos.close();
        }

        Schema<UserFundGroupData> schema = RuntimeSchema.getSchema(UserFundGroupData.class);
        UserFundGroupData userFundGroupData = schema.newMessage();
        ProtostuffIOUtil.mergeFrom(bos.toByteArray(), userFundGroupData, schema);
        return userFundGroupData;
    }

    /**
     * 压缩.
     *
     * @return 压缩后的数据
     * @throws IOException
     */
    public String compress() throws IOException {
        Schema<UserFundGroupData> schema = RuntimeSchema.getSchema(UserFundGroupData.class);
        LinkedBuffer buffer = LinkedBuffer.allocate(256);
        final byte[] inputByte;
        try {
            inputByte = ProtostuffIOUtil.toByteArray(this, schema, buffer);
        } finally {
            buffer.clear();
        }
        Deflater deflater = new Deflater();
        deflater.setLevel(9);
        deflater.setInput(inputByte);
        deflater.finish();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] outputByte = new byte[256];
        try {
            int len = 0;
            while (!deflater.finished()) {
                len = deflater.deflate(outputByte);
                bos.write(outputByte, 0, len);
            }
            deflater.end();
        } finally {
            bos.close();
        }
        return Base64.getEncoder().encodeToString(bos.toByteArray());
    }
}
