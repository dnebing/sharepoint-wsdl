/**
 * MeetingsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.meetings;

public interface MeetingsSoap extends java.rmi.Remote {
    public com.microsoft.schemas.sharepoint.soap.meetings.CreateWorkspaceResponseCreateWorkspaceResult createWorkspace(java.lang.String title, java.lang.String templateName, org.apache.axis.types.UnsignedInt lcid, com.microsoft.schemas.sharepoint.soap.meetings.TimeZoneInf timeZoneInformation) throws java.rmi.RemoteException;
    public void deleteWorkspace() throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingWorkspacesResponseGetMeetingWorkspacesResult getMeetingWorkspaces(boolean recurring) throws java.rmi.RemoteException;
    public void setWorkspaceTitle(java.lang.String title) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.meetings.AddMeetingFromICalResponseAddMeetingFromICalResult addMeetingFromICal(java.lang.String organizerEmail, java.lang.String icalText) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.meetings.AddMeetingResponseAddMeetingResult addMeeting(java.lang.String organizerEmail, java.lang.String uid, org.apache.axis.types.UnsignedInt sequence, java.util.Calendar utcDateStamp, java.lang.String title, java.lang.String location, java.util.Calendar utcDateStart, java.util.Calendar utcDateEnd, boolean nonGregorian) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.meetings.UpdateMeetingFromICalResponseUpdateMeetingFromICalResult updateMeetingFromICal(java.lang.String icalText, boolean ignoreAttendees) throws java.rmi.RemoteException;
    public void updateMeeting(java.lang.String uid, org.apache.axis.types.UnsignedInt sequence, java.util.Calendar utcDateStamp, java.lang.String title, java.lang.String location, java.util.Calendar utcDateStart, java.util.Calendar utcDateEnd, boolean nonGregorian) throws java.rmi.RemoteException;
    public void removeMeeting(org.apache.axis.types.UnsignedInt recurrenceId, java.lang.String uid, org.apache.axis.types.UnsignedInt sequence, java.util.Calendar utcDateStamp, boolean cancelMeeting) throws java.rmi.RemoteException;
    public void setAttendeeResponse(java.lang.String attendeeEmail, org.apache.axis.types.UnsignedInt recurrenceId, java.lang.String uid, org.apache.axis.types.UnsignedInt sequence, java.util.Calendar utcDateTimeOrganizerCriticalChange, java.util.Calendar utcDateTimeAttendeeCriticalChange, com.microsoft.schemas.sharepoint.soap.meetings.AttendeeResponse response) throws java.rmi.RemoteException;
    public com.microsoft.schemas.sharepoint.soap.meetings.GetMeetingsInformationResponseGetMeetingsInformationResult getMeetingsInformation(org.apache.axis.types.UnsignedInt requestFlags, org.apache.axis.types.UnsignedInt lcid) throws java.rmi.RemoteException;
    public void restoreMeeting(java.lang.String uid) throws java.rmi.RemoteException;
}
