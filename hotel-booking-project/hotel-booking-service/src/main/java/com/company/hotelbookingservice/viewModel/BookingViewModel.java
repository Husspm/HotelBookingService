package com.company.hotelbookingservice.viewModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class BookingViewModel implements Serializable {

    private Integer roomNumber;
    private String roomType;
    private boolean rewardsMember;
    private boolean doubleBonusDay;
    private BigDecimal baseRate;
    private BigDecimal memberDiscount;
    private Integer baseRewardsPoints;
    private boolean canDouble;
    private BigDecimal finalCost;
    private Integer totalRewardsPoints;

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public boolean isDoubleBonusDay() {
        return doubleBonusDay;
    }

    public void setDoubleBonusDay(boolean doubleBonusDay) {
        this.doubleBonusDay = doubleBonusDay;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public BigDecimal getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(BigDecimal memberDiscount) {
        this.memberDiscount = memberDiscount;
    }

    public Integer getBaseRewardsPoints() {
        return baseRewardsPoints;
    }

    public void setBaseRewardsPoints(Integer baseRewardsPoints) {
        this.baseRewardsPoints = baseRewardsPoints;
    }

    public boolean isCanDouble() {
        return canDouble;
    }

    public void setCanDouble(boolean canDouble) {
        this.canDouble = canDouble;
    }

    public BigDecimal getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(BigDecimal finalCost) {
        this.finalCost = finalCost;
    }

    public Integer getTotalRewardsPoints() {
        return totalRewardsPoints;
    }

    public void setTotalRewardsPoints(Integer totalRewardsPoints) {
        this.totalRewardsPoints = totalRewardsPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingViewModel that = (BookingViewModel) o;
        return rewardsMember == that.rewardsMember &&
                doubleBonusDay == that.doubleBonusDay &&
                canDouble == that.canDouble &&
                Objects.equals(roomNumber, that.roomNumber) &&
                Objects.equals(roomType, that.roomType) &&
                Objects.equals(baseRate, that.baseRate) &&
                Objects.equals(memberDiscount, that.memberDiscount) &&
                Objects.equals(baseRewardsPoints, that.baseRewardsPoints) &&
                Objects.equals(finalCost, that.finalCost) &&
                Objects.equals(totalRewardsPoints, that.totalRewardsPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, roomType, rewardsMember, doubleBonusDay, baseRate, memberDiscount, baseRewardsPoints, canDouble, finalCost, totalRewardsPoints);
    }
}
