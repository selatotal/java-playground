package br.com.selat.redistest.contract;

import java.io.Serializable;
import java.util.*;

public class OperationDeskFilterDto implements Serializable
{
    private static final long serialVersionUID = -7236622117863896056L;

    static List<Long> emptyArray = Collections.singletonList(-1L);
    static List<String> emptyStringArray = new ArrayList<>();

    private Long id;
    private String name;
    private Long customerId;
    private List<Long> businessUnitIds;
    private List<Long> clientIds;
    private List<Long> workplaceIds;
    private List<Long> personIds;
    private List<Long> serviceTypeIds;
    private List<Long> clientTypeIds;
    private List<Long> deviceIds;
    private List<Long> companysIds;
    private List<Long> absenceSituationIds;
    private List<Long> workplaceFinishStatusIds;
    private List<Long> typeeventIds;
    private List<Long> scheduleGroupIds;
    private List<Long> scheduleIds;
    private Boolean fractionalVacancy;
    private List<Long> companysWorkplaceIds;
    private Date filterDate;
    private Date finishDate;
    private Boolean inconsistencies;
    private Boolean lackOfStaff;
    private Boolean undercoverWorkplace;
    private Boolean idlePeriod;

    private String businessUnitNames;
    private String clientNames;
    private String workplaceNames;
    private String personNames;
    private String serviceTypeNames;
    private Long statusId;
    private String value;
    private List<Long> careerIds;
    private List<Long> workplaceCityIds;
    private Long noticeCollectorId;


    private List<Long> areaIds;
    private List<Long> personIdsExceptions;
    private List<String> workplaceCostCenters;
    private List<String> enrolmentIds;
    private List<Long> scheduleTurnIds;
    private List<Long> rotationIds;

    public List<Long> getAreaIds()
    {
        if (areaIds == null) {
            return emptyArray;
        }
        return areaIds;
    }

    public void setAreaIds(List<Long> areaIds)
    {
        this.areaIds = areaIds;
    }

    public OperationDeskFilterDto()
    {
        super();
    }

    public OperationDeskFilterDto(Long customerId, List<Long> businessUnitIds, List<Long> clientIds, List<Long> workplaceIds, List<Long> personIds, List<Long> serviceTypeIds, List<Long> deviceIds, Date filterDate, Boolean inconsistencies, Boolean lackOfStaff, String businessUnitNames, String clientNames, String workplaceNames, String personNames, String serviceTypeNames)
    {
        super();
        this.customerId = customerId;
        this.businessUnitIds = businessUnitIds;
        this.clientIds = clientIds;
        this.workplaceIds = workplaceIds;
        this.personIds = personIds;
        this.serviceTypeIds = serviceTypeIds;
        this.deviceIds = deviceIds;
        this.filterDate = filterDate;
        this.inconsistencies = inconsistencies;
        this.lackOfStaff = lackOfStaff;
        this.businessUnitNames = businessUnitNames;
        this.clientNames = clientNames;
        this.workplaceNames = workplaceNames;
        this.personNames = personNames;
        this.serviceTypeNames = serviceTypeNames;
    }

    public OperationDeskFilterDto(Long customerId, List<Long> businessUnitIds, List<Long> clientIds, List<Long> workplaceIds, List<Long> personIds, List<Long> deviceIds, Date filterDate, String businessUnitNames, String clientNames, String workplaceNames, String personNames, String serviceTypeNames)
    {
        super();
        this.customerId = customerId;
        this.businessUnitIds = businessUnitIds;
        this.clientIds = clientIds;
        this.workplaceIds = workplaceIds;
        this.personIds = personIds;
        this.deviceIds = deviceIds;
        this.filterDate = filterDate;
        this.businessUnitNames = businessUnitNames;
        this.clientNames = clientNames;
        this.workplaceNames = workplaceNames;
        this.personNames = personNames;
        this.serviceTypeNames = serviceTypeNames;
    }

    public OperationDeskFilterDto(Long customerId, List<Long> businessUnitIds, List<Long> clientIds, List<Long> workplaceIds, List<Long> personIds, List<Long> deviceIds, Date filterDate)
    {
        super();
        this.customerId = customerId;
        this.businessUnitIds = businessUnitIds;
        this.clientIds = clientIds;
        this.workplaceIds = workplaceIds;
        this.personIds = personIds;
        this.deviceIds = deviceIds;
        this.filterDate = filterDate;
    }

    public OperationDeskFilterDto(Long customerId, List<Long> businessUnitIds, List<Long> clientIds, List<Long> workplaceIds, List<Long> personIds, List<Long> deviceIds, Date filterDate
            , Boolean fractionalVacancy)
    {
        super();
        this.customerId = customerId;
        this.businessUnitIds = businessUnitIds;
        this.clientIds = clientIds;
        this.workplaceIds = workplaceIds;
        this.personIds = personIds;
        this.deviceIds = deviceIds;
        this.filterDate = filterDate;
        this.fractionalVacancy = fractionalVacancy;
    }
    public OperationDeskFilterDto(Long customerId, List<Long> businessUnitIds, List<Long> clientIds, List<Long> workplaceIds, List<Long> personIds, List<Long> serviceTypeIds, List<Long> deviceIds, Date filterDate, Boolean inconsistencies, Boolean lackOfStaff, String businessUnitNames, String clientNames, String workplaceNames, String personNames, String serviceTypeNames, List <Long> careerIds)
    {
        super();
        this.customerId = customerId;
        this.businessUnitIds = businessUnitIds;
        this.clientIds = clientIds;
        this.workplaceIds = workplaceIds;
        this.personIds = personIds;
        this.serviceTypeIds = serviceTypeIds;
        this.deviceIds = deviceIds;
        this.filterDate = filterDate;
        this.inconsistencies = inconsistencies;
        this.lackOfStaff = lackOfStaff;
        this.businessUnitNames = businessUnitNames;
        this.clientNames = clientNames;
        this.workplaceNames = workplaceNames;
        this.personNames = personNames;
        this.serviceTypeNames = serviceTypeNames;
        this.careerIds = careerIds;
    }
    public List<Long> getCareerIds() {
        if (this.careerIds == null) {
            return emptyArray;
        }
        return this.careerIds;
    }

    public void setCareerIds(List<Long> careerIds) {
        this.careerIds = careerIds;
    }

    public Long getCustomerId()
    {
        return this.customerId;
    }

    public void setCustomerId(Long customerId)
    {
        this.customerId = customerId;
    }

    public List<Long> getBusinessUnitIds()
    {
        if (this.businessUnitIds == null) {
            return emptyArray;
        }
        return this.businessUnitIds;
    }

    public void setBusinessUnitIds(List<Long> businessUnitIds)
    {
        this.businessUnitIds = businessUnitIds;
    }

    public List<Long> getClientIds()
    {
        if (this.clientIds == null) {
            return emptyArray;
        }
        return this.clientIds;
    }

    public void setClientIds(List<Long> clientIds)
    {
        this.clientIds = clientIds;
    }

    public List<Long> getWorkplaceIds()
    {
        if (this.workplaceIds == null) {
            return emptyArray;
        }
        return this.workplaceIds;
    }

    public void setWorkplaceIds(List<Long> workplaceIds)
    {
        this.workplaceIds = workplaceIds;
    }

    public List<Long> getPersonIds()
    {
        if (this.personIds == null) {
            return emptyArray;
        }
        return this.personIds;
    }

    public void setPersonIds(List<Long> personIds)
    {
        this.personIds = personIds;
    }

    public List<Long> getServiceTypeIds()
    {
        if (this.serviceTypeIds == null) {
            return emptyArray;
        }
        return this.serviceTypeIds;
    }

    public void setClientTypeIds(List<Long> clientTypeIds)
    {
        this.clientTypeIds = clientTypeIds;
    }

    public List<Long> getClientTypeIds()
    {
        if (this.clientTypeIds == null) {
            return emptyArray;
        }
        return this.clientTypeIds;
    }

    public void setServiceTypeIds(List<Long> serviceTypeIds)
    {
        this.serviceTypeIds = serviceTypeIds;
    }

    public Boolean getInconsistencies()
    {
        return this.inconsistencies;
    }

    public void setInconsistencies(Boolean inconsistencies)
    {
        this.inconsistencies = inconsistencies;
    }

    public Boolean getLackOfStaff()
    {
        return this.lackOfStaff;
    }

    public void setLackOfStaff(Boolean lackOfStaff)
    {
        this.lackOfStaff = lackOfStaff;
    }

    public static Integer getSize(List<Long> list) {
        return (list != null && !list.equals(emptyArray) ? list.size() : null);
    }

    public static Integer getSizeString(List<String> list) {
        return (list != null && !list.equals(emptyStringArray) ? list.size() : null);
    }

    public Date getFilterDate()
    {
        return this.filterDate;
    }

    public void setFilterDate(Date filterDate)
    {
        this.filterDate = filterDate;
    }

    public String getBusinessUnitNames()
    {
        return this.businessUnitNames;
    }

    public void setBusinessUnitNames(String businessUnitNames)
    {
        this.businessUnitNames = businessUnitNames;
    }

    public String getClientNames()
    {
        return this.clientNames;
    }

    public void setClientNames(String clientNames)
    {
        this.clientNames = clientNames;
    }

    public String getWorkplaceNames()
    {
        return this.workplaceNames;
    }

    public void setWorkplaceNames(String workplaceNames)
    {
        this.workplaceNames = workplaceNames;
    }

    public String getPersonNames()
    {

        return this.personNames;
    }

    public void setPersonNames(String personNames)
    {
        this.personNames = personNames;
    }

    public String getServiceTypeNames()
    {
        return this.serviceTypeNames;
    }

    public void setServiceTypeNames(String serviceTypeNames)
    {
        this.serviceTypeNames = serviceTypeNames;
    }

    public List<Long> getDeviceIds()
    {
        if (this.deviceIds == null) {
            return emptyArray;
        }
        return this.deviceIds;
    }

    public void setDeviceIds(List<Long> deviceIds)
    {
        this.deviceIds = deviceIds;
    }

    public List<Long> getCompanysIds()
    {
        if (this.companysIds == null) {
            return emptyArray;
        }
        return this.companysIds;
    }

    public void setCompanysIds(List<Long> companysIds)
    {
        this.companysIds = companysIds;
    }

    public List<Long> getAbsenceSituationIds()
    {
        if (this.absenceSituationIds == null) {
            return emptyArray;
        }
        return this.absenceSituationIds;
    }

    public void setAbsenceSituationIds(List<Long> absenceSituationIds)
    {
        this.absenceSituationIds = absenceSituationIds;
    }

    public List<Long> getWorkplaceFinishStatusIds() {
        return this.workplaceFinishStatusIds;
    }

    public void setWorkplaceFinishStatusIds(List<Long> workplaceFinishStatusIds) {
        this.workplaceFinishStatusIds = workplaceFinishStatusIds;
    }

    public Date getFinishDate() {
        return this.finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Boolean getFractionalVacancy() {
        return this.fractionalVacancy;
    }

    public void setFractionalVacancy(Boolean fractionalVacancy) {
        this.fractionalVacancy = fractionalVacancy;
    }

    public List<Long> getCompanysWorkplaceIds()
    {
        if (this.companysWorkplaceIds == null) {
            return emptyArray;
        }
        return this.companysWorkplaceIds;
    }

    public void setCompanysWorkplaceIds(List<Long> companysWorkplaceIds)
    {
        this.companysWorkplaceIds = companysWorkplaceIds;
    }

    public Boolean getUndercoverWorkplace() {
        return this.undercoverWorkplace;
    }

    public void setUndercoverWorkplace(Boolean undercoverWorkplace) {
        this.undercoverWorkplace = undercoverWorkplace;
    }

    public Long getStatusId() {
        return this.statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public List<Long> getTypeeventIds() {
        return this.typeeventIds;
    }

    public void setTypeeventIds(List<Long> typeeventIds) {
        this.typeeventIds = typeeventIds;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Long> getScheduleGroupIds() {
        if (this.scheduleGroupIds == null) {
            return emptyArray;
        }
        return this.scheduleGroupIds;
    }

    public void setScheduleGroupIds(List<Long> scheduleGroupIds) {
        this.scheduleGroupIds = scheduleGroupIds;
    }
    public List<Long> getPersonIdsExceptions() {
        if (this.personIdsExceptions == null) {
            return emptyArray;
        }
        return this.personIdsExceptions;
    }

    public void setPersonIdsExeptions(List<Long> personIdsExceptions) {
        this.personIdsExceptions = personIdsExceptions;
    }

    public List<Long> getWorkplaceCityIds() {
        return this.workplaceCityIds;
    }

    public void setWorkplaceCityIds(List<Long> workplaceCityIds) {
        this.workplaceCityIds = workplaceCityIds;
    }

    public Boolean getIdlePeriod() {
        return idlePeriod;
    }

    public void setIdlePeriod(Boolean idlePeriod) {
        this.idlePeriod = idlePeriod;
    }

    public List<String> getEnrolmentIds()
    {
        return enrolmentIds;
    }

    public void setEnrolmentIds(List<String> enrolmentIds)
    {
        this.enrolmentIds = enrolmentIds;
    }

    public List<Long> getScheduleIds() {
        return scheduleIds;
    }

    public void setScheduleIds(List<Long> scheduleIds) {
        this.scheduleIds = scheduleIds;
    }

    public List<Long> getScheduleTurnIds() {
        return scheduleTurnIds;
    }

    public void setScheduleTurnIds(List<Long> scheduleTurnIds) {
        this.scheduleTurnIds = scheduleTurnIds;
    }

    public List<Long> getRotationIds() {
        return rotationIds;
    }

    public void setRotationIds(List<Long> rotationIds) {
        this.rotationIds = rotationIds;
    }

    public List<String> getWorkplaceCostCenters()
    {
        return workplaceCostCenters;
    }

    public void setWorkplaceCostCenters(List<String> workplaceCostCenters)
    {
        this.workplaceCostCenters = workplaceCostCenters;
    }

    public Long getNoticeCollectorId() {
        return noticeCollectorId;
    }

    public void setNoticeCollectorId(Long noticeCollectorId) {
        this.noticeCollectorId = noticeCollectorId;
    }

    @Override
    public String toString() {
        return "OperationDeskFilterDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                ", businessUnitIds=" + businessUnitIds +
                ", clientIds=" + clientIds +
                ", workplaceIds=" + workplaceIds +
                ", personIds=" + personIds +
                ", serviceTypeIds=" + serviceTypeIds +
                ", clientTypeIds=" + clientTypeIds +
                ", deviceIds=" + deviceIds +
                ", companysIds=" + companysIds +
                ", absenceSituationIds=" + absenceSituationIds +
                ", workplaceFinishStatusIds=" + workplaceFinishStatusIds +
                ", typeeventIds=" + typeeventIds +
                ", scheduleGroupIds=" + scheduleGroupIds +
                ", scheduleIds=" + scheduleIds +
                ", fractionalVacancy=" + fractionalVacancy +
                ", companysWorkplaceIds=" + companysWorkplaceIds +
                ", filterDate=" + filterDate +
                ", finishDate=" + finishDate +
                ", inconsistencies=" + inconsistencies +
                ", lackOfStaff=" + lackOfStaff +
                ", undercoverWorkplace=" + undercoverWorkplace +
                ", idlePeriod=" + idlePeriod +
                ", businessUnitNames='" + businessUnitNames + '\'' +
                ", clientNames='" + clientNames + '\'' +
                ", workplaceNames='" + workplaceNames + '\'' +
                ", personNames='" + personNames + '\'' +
                ", serviceTypeNames='" + serviceTypeNames + '\'' +
                ", statusId=" + statusId +
                ", value='" + value + '\'' +
                ", careerIds=" + careerIds +
                ", workplaceCityIds=" + workplaceCityIds +
                ", noticeCollectorId=" + noticeCollectorId +
                ", areaIds=" + areaIds +
                ", personIdsExceptions=" + personIdsExceptions +
                ", workplaceCostCenters=" + workplaceCostCenters +
                ", enrolmentIds=" + enrolmentIds +
                ", scheduleTurnIds=" + scheduleTurnIds +
                ", rotationIds=" + rotationIds +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperationDeskFilterDto that = (OperationDeskFilterDto) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(customerId, that.customerId)) return false;
        if (!Objects.equals(businessUnitIds, that.businessUnitIds))
            return false;
        if (!Objects.equals(clientIds, that.clientIds)) return false;
        if (!Objects.equals(workplaceIds, that.workplaceIds)) return false;
        if (!Objects.equals(personIds, that.personIds)) return false;
        if (!Objects.equals(serviceTypeIds, that.serviceTypeIds))
            return false;
        if (!Objects.equals(clientTypeIds, that.clientTypeIds))
            return false;
        if (!Objects.equals(deviceIds, that.deviceIds)) return false;
        if (!Objects.equals(companysIds, that.companysIds)) return false;
        if (!Objects.equals(absenceSituationIds, that.absenceSituationIds))
            return false;
        if (!Objects.equals(workplaceFinishStatusIds, that.workplaceFinishStatusIds))
            return false;
        if (!Objects.equals(typeeventIds, that.typeeventIds)) return false;
        if (!Objects.equals(scheduleGroupIds, that.scheduleGroupIds))
            return false;
        if (!Objects.equals(scheduleIds, that.scheduleIds)) return false;
        if (!Objects.equals(fractionalVacancy, that.fractionalVacancy))
            return false;
        if (!Objects.equals(companysWorkplaceIds, that.companysWorkplaceIds))
            return false;
        if (!Objects.equals(filterDate, that.filterDate)) return false;
        if (!Objects.equals(finishDate, that.finishDate)) return false;
        if (!Objects.equals(inconsistencies, that.inconsistencies))
            return false;
        if (!Objects.equals(lackOfStaff, that.lackOfStaff)) return false;
        if (!Objects.equals(undercoverWorkplace, that.undercoverWorkplace))
            return false;
        if (!Objects.equals(idlePeriod, that.idlePeriod)) return false;
        if (!Objects.equals(businessUnitNames, that.businessUnitNames))
            return false;
        if (!Objects.equals(clientNames, that.clientNames)) return false;
        if (!Objects.equals(workplaceNames, that.workplaceNames))
            return false;
        if (!Objects.equals(personNames, that.personNames)) return false;
        if (!Objects.equals(serviceTypeNames, that.serviceTypeNames))
            return false;
        if (!Objects.equals(statusId, that.statusId)) return false;
        if (!Objects.equals(value, that.value)) return false;
        if (!Objects.equals(careerIds, that.careerIds)) return false;
        if (!Objects.equals(workplaceCityIds, that.workplaceCityIds))
            return false;
        if (!Objects.equals(noticeCollectorId, that.noticeCollectorId))
            return false;
        if (!Objects.equals(areaIds, that.areaIds)) return false;
        if (!Objects.equals(personIdsExceptions, that.personIdsExceptions))
            return false;
        if (!Objects.equals(workplaceCostCenters, that.workplaceCostCenters))
            return false;
        if (!Objects.equals(enrolmentIds, that.enrolmentIds)) return false;
        if (!Objects.equals(scheduleTurnIds, that.scheduleTurnIds))
            return false;
        return Objects.equals(rotationIds, that.rotationIds);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (businessUnitIds != null ? businessUnitIds.hashCode() : 0);
        result = 31 * result + (clientIds != null ? clientIds.hashCode() : 0);
        result = 31 * result + (workplaceIds != null ? workplaceIds.hashCode() : 0);
        result = 31 * result + (personIds != null ? personIds.hashCode() : 0);
        result = 31 * result + (serviceTypeIds != null ? serviceTypeIds.hashCode() : 0);
        result = 31 * result + (clientTypeIds != null ? clientTypeIds.hashCode() : 0);
        result = 31 * result + (deviceIds != null ? deviceIds.hashCode() : 0);
        result = 31 * result + (companysIds != null ? companysIds.hashCode() : 0);
        result = 31 * result + (absenceSituationIds != null ? absenceSituationIds.hashCode() : 0);
        result = 31 * result + (workplaceFinishStatusIds != null ? workplaceFinishStatusIds.hashCode() : 0);
        result = 31 * result + (typeeventIds != null ? typeeventIds.hashCode() : 0);
        result = 31 * result + (scheduleGroupIds != null ? scheduleGroupIds.hashCode() : 0);
        result = 31 * result + (scheduleIds != null ? scheduleIds.hashCode() : 0);
        result = 31 * result + (fractionalVacancy != null ? fractionalVacancy.hashCode() : 0);
        result = 31 * result + (companysWorkplaceIds != null ? companysWorkplaceIds.hashCode() : 0);
        result = 31 * result + (filterDate != null ? filterDate.hashCode() : 0);
        result = 31 * result + (finishDate != null ? finishDate.hashCode() : 0);
        result = 31 * result + (inconsistencies != null ? inconsistencies.hashCode() : 0);
        result = 31 * result + (lackOfStaff != null ? lackOfStaff.hashCode() : 0);
        result = 31 * result + (undercoverWorkplace != null ? undercoverWorkplace.hashCode() : 0);
        result = 31 * result + (idlePeriod != null ? idlePeriod.hashCode() : 0);
        result = 31 * result + (businessUnitNames != null ? businessUnitNames.hashCode() : 0);
        result = 31 * result + (clientNames != null ? clientNames.hashCode() : 0);
        result = 31 * result + (workplaceNames != null ? workplaceNames.hashCode() : 0);
        result = 31 * result + (personNames != null ? personNames.hashCode() : 0);
        result = 31 * result + (serviceTypeNames != null ? serviceTypeNames.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (careerIds != null ? careerIds.hashCode() : 0);
        result = 31 * result + (workplaceCityIds != null ? workplaceCityIds.hashCode() : 0);
        result = 31 * result + (noticeCollectorId != null ? noticeCollectorId.hashCode() : 0);
        result = 31 * result + (areaIds != null ? areaIds.hashCode() : 0);
        result = 31 * result + (personIdsExceptions != null ? personIdsExceptions.hashCode() : 0);
        result = 31 * result + (workplaceCostCenters != null ? workplaceCostCenters.hashCode() : 0);
        result = 31 * result + (enrolmentIds != null ? enrolmentIds.hashCode() : 0);
        result = 31 * result + (scheduleTurnIds != null ? scheduleTurnIds.hashCode() : 0);
        result = 31 * result + (rotationIds != null ? rotationIds.hashCode() : 0);
        return result;
    }
}