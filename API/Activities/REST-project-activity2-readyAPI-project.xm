<?xml version="1.0" encoding="UTF-8"?>
<con:soapui-project id="7bede0a2-a9ee-4e90-b145-f6497a9aa026" created="3.53.0" activeEnvironment="Default environment" encryptionMode="Not encrypted" name="REST Project Activity 2" projectVersion="" updated="3.53.0 2024-05-13T12:06:25Z" xmlns:con="http://eviware.com/soapui/config">
	<con:settings/>
	<con:interface xsi:type="con:RestService" id="44730bad-3ba1-4802-a041-653754f6f053" wadlVersion="http://wadl.dev.java.net/2009/02" name="https://petstore.swagger.io" type="rest" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
		<con:settings id="fd970542-1094-48b9-9f6f-ee3bb7cae83f"/>
		<con:definitionCache type="TEXT" rootPart=""/>
		<con:endpoints>
			<con:endpoint>https://petstore.swagger.io</con:endpoint>
		</con:endpoints>
		<con:resource name="FindByStatus" path="/v2/pet/findByStatus" id="38d7d99b-4fa6-4b9d-9cbf-82f03068a77b">
			<con:settings/>
			<con:parameters/>
			<con:method name="FindByStatus" id="ad57028b-e7fd-425e-af3f-09c4fb875844" method="GET">
				<con:settings/>
				<con:parameters>
					<con:parameter required="true">
						<con:name>status</con:name>
						<con:value>sold</con:value>
						<con:style>QUERY</con:style>
						<con:default>sold</con:default>
						<con:path xsi:nil="true"/>
						<con:description xsi:nil="true"/>
					</con:parameter>
				</con:parameters>
				<con:representation type="RESPONSE">
					<con:mediaType>application/json</con:mediaType>
					<con:status>200</con:status>
					<con:params/>
					<con:element>Response</con:element>
				</con:representation>
				<con:request name="Request 1" id="b30c0c0b-10a3-40bc-8e1a-1fa1fba18973" mediaType="application/json">
					<con:settings/>
					<con:endpoint>https://petstore.swagger.io</con:endpoint>
					<con:parameters>
						<con:entry key="status" value="sold"/>
					</con:parameters>
					<con:parameterOrder>
						<con:entry>status</con:entry>
					</con:parameterOrder>
				</con:request>
			</con:method>
		</con:resource>
	</con:interface>
	<con:testSuite id="c208dbee-aded-4757-a1ff-0bc4f62564e9" name="TestSuite">
		<con:settings id="be0e77d9-d35c-4cec-8078-322b61761ba4"/>
		<con:runType>SEQUENTIAL</con:runType>
		<con:testCase id="cca213f3-0af1-4b9e-8582-72c0d45ac85e" discardOkResults="false" failOnError="false" failTestCaseOnErrors="true" keepSession="false" name="TestCase" searchProperties="true" timeout="0">
			<con:settings/>
			<con:testStep type="restrequest" name="GET" id="046bd32e-ffe2-4976-a7a9-d0bc1cec557a">
				<con:settings/>
				<con:config service="https://petstore.swagger.io" resourcePath="/v2/pet/findByStatus" methodName="FindByStatus" xsi:type="con:RestRequestStep" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
					<con:restRequest name="GET" id="b30c0c0b-10a3-40bc-8e1a-1fa1fba18973" mediaType="application/json">
						<con:settings>
							<con:setting id="com.eviware.soapui.impl.wsdl.WsdlRequest@request-headers">&lt;xml-fragment/></con:setting>
						</con:settings>
						<con:endpoint>https://petstore.swagger.io</con:endpoint>
						<con:request/>
						<con:originalUri>https://petstore.swagger.io/v2/pet/findByStatus</con:originalUri>
						<con:assertion type="Valid HTTP Status Codes" id="fa54d315-639f-4bc7-a240-4a6545626aa6" name="Valid HTTP Status Codes">
							<con:settings/>
							<con:configuration>
								<codes>200</codes>
							</con:configuration>
						</con:assertion>
						<con:assertion type="JsonPath Match" id="80b78f18-5802-428d-a961-c9a5b1993535" name="JSONPath Match">
							<con:configuration>
								<path>$[0].['id']</path>
								<content>9223372036854266105</content>
								<allowWildcards>false</allowWildcards>
								<ignoreNamspaceDifferences>false</ignoreNamspaceDifferences>
								<ignoreComments>false</ignoreComments>
							</con:configuration>
						</con:assertion>
						<con:assertion type="JsonPath Match" id="f6c23af8-07ea-42b0-8caf-0efc42ecda58" name="JSONPath Match 2">
							<con:configuration>
								<path>$[0].['category'].['id']</path>
								<content>0</content>
								<allowWildcards>false</allowWildcards>
								<ignoreNamspaceDifferences>false</ignoreNamspaceDifferences>
								<ignoreComments>false</ignoreComments>
							</con:configuration>
						</con:assertion>
						<con:credentials>
							<con:selectedAuthProfile>No Authorization</con:selectedAuthProfile>
							<con:authType>No Authorization</con:authType>
						</con:credentials>
						<con:jmsConfig JMSDeliveryMode="PERSISTENT"/>
						<con:parameters>
							<con:entry key="status" value="sold"/>
						</con:parameters>
						<con:parameterOrder>
							<con:entry>status</con:entry>
						</con:parameterOrder>
					</con:restRequest>
				</con:config>
			</con:testStep>
			<con:properties/>
			<con:reportParameters/>
		</con:testCase>
		<con:properties/>
		<con:reportParameters/>
	</con:testSuite>
	<con:properties/>
	<con:wssContainer/>
	<con:databaseConnectionContainer/>
	<con:jmsConnectionContainer/>
	<con:oAuth2ProfileContainer/>
	<con:oAuth1ProfileContainer/>
	<con:reporting>
		<con:xmlTemplates/>
		<con:parameters/>
	</con:reporting>
	<con:eventHandlers type="RequestFilter.filterRequest" name="RequestFilter.filterRequest">
		<con:script>// Sample event script to add custom HTTP header to all outgoing REST, SOAP and HTTP(S) calls
// This code is often used for adding custom authentication to ReadyAPI functional tests

// If hardcoding the token, uncomment and change line 5
// token = '4567'

// If your token is parameterized in Project level custom property, uncomment line 8
// token = request.parent.testCase.testSuite.project.getProperty('auth_token').getValue()

// To modify all outgoing calls, remove comments from lines 11 to 16
// headers = request.requestHeaders
// if (headers.containsKey('auth_token2') == false) {
//   headers.put('auth_token2', token)
//   request.requestHeaders = headers
// }</con:script>
	</con:eventHandlers>
	<con:eventHandlers type="TestRunListener.afterStep" name="TestRunListener.afterStep">
		<con:script>// Save all test step results into files
// Change the directory path in line 5 to a location where you want to store details
// then uncomment lines 5 to 10

// filePath = 'C:\\tempOutputDirectory\\'
// fos = new java.io.FileOutputStream(filePath + testStepResult.testStep.label + '.txt', true)
// pw = new java.io.PrintWriter(fos)
// testStepResult.writeTo(pw)
// pw.close()
// fos.close()</con:script>
	</con:eventHandlers>
	<con:authRepository/>
	<con:tags/>
</con:soapui-project>
