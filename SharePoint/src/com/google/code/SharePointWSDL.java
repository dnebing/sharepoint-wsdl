package com.google.code;

import com.microsoft.schemas.sharepoint.dsp.StsAdapterSoapStub;
import com.microsoft.schemas.sharepoint.soap.CopySoapStub;
import com.microsoft.schemas.sharepoint.soap.FormsSoapStub;
import com.microsoft.schemas.sharepoint.soap.ListsSoapStub;
import com.microsoft.schemas.sharepoint.soap.PeopleSoapStub;
import com.microsoft.schemas.sharepoint.soap.SiteDataSoapStub;
import com.microsoft.schemas.sharepoint.soap.SitesSoapStub;
import com.microsoft.schemas.sharepoint.soap.VersionsSoapStub;
import com.microsoft.schemas.sharepoint.soap.ViewsSoapStub;
import com.microsoft.schemas.sharepoint.soap.WebsSoapStub;
import com.microsoft.schemas.sharepoint.soap._2002._1.alerts.AlertsSoapStub;
import com.microsoft.schemas.sharepoint.soap.directory.PermissionsSoapStub;
import com.microsoft.schemas.sharepoint.soap.directory.UserGroupSoapStub;
import com.microsoft.schemas.sharepoint.soap.dws.DwsSoapStub;
import com.microsoft.schemas.sharepoint.soap.meetings.MeetingsSoapStub;
import com.microsoft.schemas.sharepoint.soap.ois.ImagingSoapStub;
import com.microsoft.sharepoint.webpartpages.WebPartPagesWebServiceSoapStub;

public class SharePointWSDL {
	
	public static AlertsSoapStub newAlerts(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new AlertsSoapStub(endpointURL, service);
	}
	
	public static CopySoapStub newCopy(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new CopySoapStub(endpointURL, service);
	}
	
	public static StsAdapterSoapStub newStsAdapter(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new StsAdapterSoapStub(endpointURL, service);
	}

	public static DwsSoapStub newDws(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new DwsSoapStub(endpointURL, service);
	}

	public static FormsSoapStub newForms(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new FormsSoapStub(endpointURL, service);
	}

	public static ImagingSoapStub newImaging(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new ImagingSoapStub(endpointURL, service);
	}

	public static ListsSoapStub newLists(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new ListsSoapStub(endpointURL, service);
	}

	public static MeetingsSoapStub newMeetings(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new MeetingsSoapStub(endpointURL, service);
	}

	public static PeopleSoapStub newPeople(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new PeopleSoapStub(endpointURL, service);
	}

	public static PermissionsSoapStub newPermissions(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new PermissionsSoapStub(endpointURL, service);
	}

	public static SiteDataSoapStub newSiteData(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new SiteDataSoapStub(endpointURL, service);
	}

	public static SitesSoapStub newSites(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new SitesSoapStub(endpointURL, service);
	}

	public static UserGroupSoapStub newUserGroup(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new UserGroupSoapStub(endpointURL, service);
	}

	public static VersionsSoapStub newVersions(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new VersionsSoapStub(endpointURL, service);
	}

	public static ViewsSoapStub newViews(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new ViewsSoapStub(endpointURL, service);
	}

	public static WebPartPagesWebServiceSoapStub newWebPartPagesWebService(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new WebPartPagesWebServiceSoapStub(endpointURL, service);
	}

	public static WebsSoapStub newWebs(java.net.URL endpointURL, javax.xml.rpc.Service service) throws Exception {
		return new WebsSoapStub(endpointURL, service);
	}
	
}
