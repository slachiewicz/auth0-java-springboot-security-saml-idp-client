# Auth0 Java Spring Boot Security Regular Webapp SAML IDP Client   

This is a Java Spring Boot Security Regular Web application that uses the SAML2 protocol
to authentication against Auth0 as SAML IDP

Full configuration options [here](https://gist.github.com/arcseldon/fc601419c5e7ccc5a776ff3b56b82955)

## Setup

### Locally

Optional, dev. setup.

Add:

```
127.0.0.1  app1.com
```

to your `/etc/hosts` file.


### Dashboard

Create a regular web application Client.

Under settings ensure you have:

Client-Type: Regular Web Application 

Allowed Callback URLs:
 - http://app1.com:3000/saml/SSO

Allowed Logout URLs
 - http://app1.com:3000/logout

Under tenant settings -> advanced -> Allowed Logout URLs
 - http://app1.com:3000/logout


Under `Application -> Addons -> SAML2 Web App`

We shall be following [these Auth0 documentation instructions](https://auth0.com/docs/protocols/saml/saml-idp-generic#2-configure-auth0-as-idp)

Enable the `SAML2 Web App toggle`

Optionally, add any specific settings you like in `Settings` textarea.

For example:

```
{
  "nameIdentifierProbes": [
    "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress"
  ]
}
```

Under `Application -> Addons -> SAML2 Web App` (`Usage` tab)

Select `Identity Provider Metadata: download` and download the metadata file.

Rename as `auth0-metadata.xml` and place under `/src/main/resources` in this project.


## Running the Sample

You need maven and java 8+

Run the application by executing the command below.

```bash
mvn spring-boot:run
```

The app will be served at `http://app1.com:3000`.


## What is Auth0?

Auth0 helps you to:

* Add authentication with [multiple authentication sources](https://docs.auth0.com/identityproviders), either social like **Google, Facebook, Microsoft Account, LinkedIn, GitHub, Twitter, Box, Salesforce, amont others**, or enterprise identity systems like **Windows Azure AD, Google Apps, Active Directory, ADFS or any SAML Identity Provider**.
* Add authentication through more traditional **[username/password databases](https://docs.auth0.com/mysql-connection-tutorial)**.
* Add support for **[linking different user accounts](https://docs.auth0.com/link-accounts)** with the same user.
* Support for generating signed [Json Web Tokens](https://docs.auth0.com/jwt) to call your APIs and **flow the user identity** securely.
* Analytics of how, when and where users are logging in.
* Pull data from other sources and add it to the user profile, through [JavaScript rules](https://docs.auth0.com/rules).

## Create a free account in Auth0

1. Go to [Auth0](https://auth0.com) and click Sign Up.
2. Use Google, GitHub or Microsoft Account to login.

## Issue Reporting

If you have found a bug or if you have a feature request, please report them at this repository issues section. Please do not report security vulnerabilities on the public GitHub issue tracker. The [Responsible Disclosure Program](https://auth0.com/whitehat) details the procedure for disclosing security issues.

## Author

[Auth0](auth0.com)

## License

This project is licensed under the MIT license. See the [LICENSE](LICENSE) file for more info.

