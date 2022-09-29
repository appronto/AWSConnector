# AWSConnector

The Appronto AWS Connector allows you to quickly generate the required headers for your REST API call. The only requirement is to create a single object AWSv4Signature object and populate this with the required fields for the service you would like to call.


# Signature Version 4 (SigV4)

Signature Version 4 (SigV4) is the process to add authentication information to AWS API requests sent by HTTP. For security, most requests to AWS must be signed with an access key. The access key consists of an access key ID and secret access key, which are commonly referred to as your security credentials.

Derive a signing key by performing a succession of keyed hash operations (HMAC operations) on the request date, Region, and service, with your AWS secret access key as the key for the initial hashing operation. After you derive the signing key, you then calculate the signature by performing a keyed hash operation on the string to sign. Use the derived signing key as the hash key for this operation.

# TL;DR

Creating an Authorization signature can be quite complex.

The Appronto AWS Connector allows you to quickly generate the required headers for your REST API call. The only requirement is to create a single object AWSv4Signature object and populate this with the required fields for the service you would like to call.
Through a JAVA action, this AWSv4Signature object is used to generate the Authorization and other required headers.

Examples are included for :
 - TranslateText
 - Polly Text to Speech
 - Rekognition Recognize Celebrities


## Dependencies
There are no dependencies on other modules or SDK Jar files. The only JAR included is **commons-io-2.11.0.jar** for Base64 encoding.


## Installation
* Import the Appronto AWSConnector module in your project.
* Configure an IAM User and attached the required policies.
* Generate the Access Key and Secret Key.
* Update the constants AWS_AccessKey and AWS_SecretKey with the values above.


## Configuration options
Have a look at the example flows for configuration options.
 

## Remarks



## License
Licensed under the Apache license.


## Developers notes
Initial version is the result of the Mendix MxHacks event where it became clear that generating a V4 Signature to call REST Endpoints is quite a challenge! We hope we can make life a little easier for those that want to integrate with AWS API services.


# Version history
1.0 Initial version
