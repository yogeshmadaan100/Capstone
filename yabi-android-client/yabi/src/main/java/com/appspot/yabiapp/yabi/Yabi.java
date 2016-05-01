/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-04-08 17:16:44 UTC)
 * on 2016-04-14 at 19:15:47 UTC 
 * Modify at your own risk.
 */

package com.appspot.yabiapp.yabi;

/**
 * Service definition for Yabi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link YabiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Yabi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the yabi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://yabiapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "yabi/v1/user/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Yabi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Yabi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the User collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Yabi yabi = new Yabi(...);}
   *   {@code Yabi.User.List request = yabi.user().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public User user() {
    return new User();
  }

  /**
   * The "user" collection of methods.
   */
  public class User {

    /**
     * Get details and offers of merchant.
     *
     * Create a request for the method "user.getMerchant".
     *
     * This request holds the parameters needed by the yabi server.  After setting any optional
     * parameters, call the {@link GetMerchant#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public GetMerchant getMerchant() throws java.io.IOException {
      GetMerchant result = new GetMerchant();
      initialize(result);
      return result;
    }

    public class GetMerchant extends YabiRequest<com.appspot.yabiapp.yabi.model.CloudEndpointsUserMerchantDetails> {

      private static final String REST_PATH = "getMerchant";

      /**
       * Get details and offers of merchant.
       *
       * Create a request for the method "user.getMerchant".
       *
       * This request holds the parameters needed by the the yabi server.  After setting any optional
       * parameters, call the {@link GetMerchant#execute()} method to invoke the remote operation. <p>
       * {@link
       * GetMerchant#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected GetMerchant() {
        super(Yabi.this, "GET", REST_PATH, null, com.appspot.yabiapp.yabi.model.CloudEndpointsUserMerchantDetails.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetMerchant setAlt(java.lang.String alt) {
        return (GetMerchant) super.setAlt(alt);
      }

      @Override
      public GetMerchant setFields(java.lang.String fields) {
        return (GetMerchant) super.setFields(fields);
      }

      @Override
      public GetMerchant setKey(java.lang.String key) {
        return (GetMerchant) super.setKey(key);
      }

      @Override
      public GetMerchant setOauthToken(java.lang.String oauthToken) {
        return (GetMerchant) super.setOauthToken(oauthToken);
      }

      @Override
      public GetMerchant setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetMerchant) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetMerchant setQuotaUser(java.lang.String quotaUser) {
        return (GetMerchant) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetMerchant setUserIp(java.lang.String userIp) {
        return (GetMerchant) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long id;

      /**

       */
      public java.lang.Long getId() {
        return id;
      }

      public GetMerchant setId(java.lang.Long id) {
        this.id = id;
        return this;
      }

      @Override
      public GetMerchant set(String parameterName, Object value) {
        return (GetMerchant) super.set(parameterName, value);
      }
    }
    /**
     * Get list of all merchant.
     *
     * Create a request for the method "user.getMerchantsList".
     *
     * This request holds the parameters needed by the yabi server.  After setting any optional
     * parameters, call the {@link GetMerchantsList#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public GetMerchantsList getMerchantsList() throws java.io.IOException {
      GetMerchantsList result = new GetMerchantsList();
      initialize(result);
      return result;
    }

    public class GetMerchantsList extends YabiRequest<com.appspot.yabiapp.yabi.model.CloudEndpointsUserMerchantList> {

      private static final String REST_PATH = "getMerchantsList";

      /**
       * Get list of all merchant.
       *
       * Create a request for the method "user.getMerchantsList".
       *
       * This request holds the parameters needed by the the yabi server.  After setting any optional
       * parameters, call the {@link GetMerchantsList#execute()} method to invoke the remote operation.
       * <p> {@link GetMerchantsList#initialize(com.google.api.client.googleapis.services.AbstractGoogle
       * ClientRequest)} must be called to initialize this instance immediately after invoking the
       * constructor. </p>
       *
       * @since 1.13
       */
      protected GetMerchantsList() {
        super(Yabi.this, "GET", REST_PATH, null, com.appspot.yabiapp.yabi.model.CloudEndpointsUserMerchantList.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetMerchantsList setAlt(java.lang.String alt) {
        return (GetMerchantsList) super.setAlt(alt);
      }

      @Override
      public GetMerchantsList setFields(java.lang.String fields) {
        return (GetMerchantsList) super.setFields(fields);
      }

      @Override
      public GetMerchantsList setKey(java.lang.String key) {
        return (GetMerchantsList) super.setKey(key);
      }

      @Override
      public GetMerchantsList setOauthToken(java.lang.String oauthToken) {
        return (GetMerchantsList) super.setOauthToken(oauthToken);
      }

      @Override
      public GetMerchantsList setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetMerchantsList) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetMerchantsList setQuotaUser(java.lang.String quotaUser) {
        return (GetMerchantsList) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetMerchantsList setUserIp(java.lang.String userIp) {
        return (GetMerchantsList) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long category;

      /**

       */
      public java.lang.Long getCategory() {
        return category;
      }

      public GetMerchantsList setCategory(java.lang.Long category) {
        this.category = category;
        return this;
      }

      @com.google.api.client.util.Key("location.long")
      private java.lang.Double locationLong;

      /**

       */
      public java.lang.Double getLocationLong() {
        return locationLong;
      }

      public GetMerchantsList setLocationLong(java.lang.Double locationLong) {
        this.locationLong = locationLong;
        return this;
      }

      @com.google.api.client.util.Key("location.lat")
      private java.lang.Double locationLat;

      /**

       */
      public java.lang.Double getLocationLat() {
        return locationLat;
      }

      public GetMerchantsList setLocationLat(java.lang.Double locationLat) {
        this.locationLat = locationLat;
        return this;
      }

      @Override
      public GetMerchantsList set(String parameterName, Object value) {
        return (GetMerchantsList) super.set(parameterName, value);
      }
    }
    /**
     * Get profile of user.
     *
     * Create a request for the method "user.getProfile".
     *
     * This request holds the parameters needed by the yabi server.  After setting any optional
     * parameters, call the {@link GetProfile#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public GetProfile getProfile() throws java.io.IOException {
      GetProfile result = new GetProfile();
      initialize(result);
      return result;
    }

    public class GetProfile extends YabiRequest<com.appspot.yabiapp.yabi.model.CloudEndpointsUserResponse> {

      private static final String REST_PATH = "getProfile";

      /**
       * Get profile of user.
       *
       * Create a request for the method "user.getProfile".
       *
       * This request holds the parameters needed by the the yabi server.  After setting any optional
       * parameters, call the {@link GetProfile#execute()} method to invoke the remote operation. <p>
       * {@link
       * GetProfile#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected GetProfile() {
        super(Yabi.this, "GET", REST_PATH, null, com.appspot.yabiapp.yabi.model.CloudEndpointsUserResponse.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetProfile setAlt(java.lang.String alt) {
        return (GetProfile) super.setAlt(alt);
      }

      @Override
      public GetProfile setFields(java.lang.String fields) {
        return (GetProfile) super.setFields(fields);
      }

      @Override
      public GetProfile setKey(java.lang.String key) {
        return (GetProfile) super.setKey(key);
      }

      @Override
      public GetProfile setOauthToken(java.lang.String oauthToken) {
        return (GetProfile) super.setOauthToken(oauthToken);
      }

      @Override
      public GetProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetProfile) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetProfile setQuotaUser(java.lang.String quotaUser) {
        return (GetProfile) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetProfile setUserIp(java.lang.String userIp) {
        return (GetProfile) super.setUserIp(userIp);
      }

      @Override
      public GetProfile set(String parameterName, Object value) {
        return (GetProfile) super.set(parameterName, value);
      }
    }
    /**
     * Login for user.
     *
     * Create a request for the method "user.login".
     *
     * This request holds the parameters needed by the yabi server.  After setting any optional
     * parameters, call the {@link Login#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.yabiapp.yabi.model.CloudEndpointsUserUser}
     * @return the request
     */
    public Login login(com.appspot.yabiapp.yabi.model.CloudEndpointsUserUser content) throws java.io.IOException {
      Login result = new Login(content);
      initialize(result);
      return result;
    }

    public class Login extends YabiRequest<com.appspot.yabiapp.yabi.model.CloudEndpointsUserResponse> {

      private static final String REST_PATH = "login";

      /**
       * Login for user.
       *
       * Create a request for the method "user.login".
       *
       * This request holds the parameters needed by the the yabi server.  After setting any optional
       * parameters, call the {@link Login#execute()} method to invoke the remote operation. <p> {@link
       * Login#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.yabiapp.yabi.model.CloudEndpointsUserUser}
       * @since 1.13
       */
      protected Login(com.appspot.yabiapp.yabi.model.CloudEndpointsUserUser content) {
        super(Yabi.this, "POST", REST_PATH, content, com.appspot.yabiapp.yabi.model.CloudEndpointsUserResponse.class);
      }

      @Override
      public Login setAlt(java.lang.String alt) {
        return (Login) super.setAlt(alt);
      }

      @Override
      public Login setFields(java.lang.String fields) {
        return (Login) super.setFields(fields);
      }

      @Override
      public Login setKey(java.lang.String key) {
        return (Login) super.setKey(key);
      }

      @Override
      public Login setOauthToken(java.lang.String oauthToken) {
        return (Login) super.setOauthToken(oauthToken);
      }

      @Override
      public Login setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Login) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Login setQuotaUser(java.lang.String quotaUser) {
        return (Login) super.setQuotaUser(quotaUser);
      }

      @Override
      public Login setUserIp(java.lang.String userIp) {
        return (Login) super.setUserIp(userIp);
      }

      @Override
      public Login set(String parameterName, Object value) {
        return (Login) super.set(parameterName, value);
      }
    }
    /**
     * Get details and offers on android app.
     *
     * Create a request for the method "user.offersOnApp".
     *
     * This request holds the parameters needed by the yabi server.  After setting any optional
     * parameters, call the {@link OffersOnApp#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public OffersOnApp offersOnApp() throws java.io.IOException {
      OffersOnApp result = new OffersOnApp();
      initialize(result);
      return result;
    }

    public class OffersOnApp extends YabiRequest<com.appspot.yabiapp.yabi.model.CloudEndpointsUserMerchantDetails> {

      private static final String REST_PATH = "offersOnApp";

      /**
       * Get details and offers on android app.
       *
       * Create a request for the method "user.offersOnApp".
       *
       * This request holds the parameters needed by the the yabi server.  After setting any optional
       * parameters, call the {@link OffersOnApp#execute()} method to invoke the remote operation. <p>
       * {@link
       * OffersOnApp#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected OffersOnApp() {
        super(Yabi.this, "GET", REST_PATH, null, com.appspot.yabiapp.yabi.model.CloudEndpointsUserMerchantDetails.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public OffersOnApp setAlt(java.lang.String alt) {
        return (OffersOnApp) super.setAlt(alt);
      }

      @Override
      public OffersOnApp setFields(java.lang.String fields) {
        return (OffersOnApp) super.setFields(fields);
      }

      @Override
      public OffersOnApp setKey(java.lang.String key) {
        return (OffersOnApp) super.setKey(key);
      }

      @Override
      public OffersOnApp setOauthToken(java.lang.String oauthToken) {
        return (OffersOnApp) super.setOauthToken(oauthToken);
      }

      @Override
      public OffersOnApp setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (OffersOnApp) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public OffersOnApp setQuotaUser(java.lang.String quotaUser) {
        return (OffersOnApp) super.setQuotaUser(quotaUser);
      }

      @Override
      public OffersOnApp setUserIp(java.lang.String userIp) {
        return (OffersOnApp) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key("package_name")
      private java.lang.String packageName;

      /**

       */
      public java.lang.String getPackageName() {
        return packageName;
      }

      public OffersOnApp setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
        return this;
      }

      @Override
      public OffersOnApp set(String parameterName, Object value) {
        return (OffersOnApp) super.set(parameterName, value);
      }
    }
    /**
     * Send OTP to user.
     *
     * Create a request for the method "user.sendOTP".
     *
     * This request holds the parameters needed by the yabi server.  After setting any optional
     * parameters, call the {@link SendOTP#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.yabiapp.yabi.model.CloudEndpointsUserPhoneNumber}
     * @return the request
     */
    public SendOTP sendOTP(com.appspot.yabiapp.yabi.model.CloudEndpointsUserPhoneNumber content) throws java.io.IOException {
      SendOTP result = new SendOTP(content);
      initialize(result);
      return result;
    }

    public class SendOTP extends YabiRequest<com.appspot.yabiapp.yabi.model.CloudEndpointsUserOTP> {

      private static final String REST_PATH = "sendOTP";

      /**
       * Send OTP to user.
       *
       * Create a request for the method "user.sendOTP".
       *
       * This request holds the parameters needed by the the yabi server.  After setting any optional
       * parameters, call the {@link SendOTP#execute()} method to invoke the remote operation. <p>
       * {@link
       * SendOTP#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.appspot.yabiapp.yabi.model.CloudEndpointsUserPhoneNumber}
       * @since 1.13
       */
      protected SendOTP(com.appspot.yabiapp.yabi.model.CloudEndpointsUserPhoneNumber content) {
        super(Yabi.this, "POST", REST_PATH, content, com.appspot.yabiapp.yabi.model.CloudEndpointsUserOTP.class);
      }

      @Override
      public SendOTP setAlt(java.lang.String alt) {
        return (SendOTP) super.setAlt(alt);
      }

      @Override
      public SendOTP setFields(java.lang.String fields) {
        return (SendOTP) super.setFields(fields);
      }

      @Override
      public SendOTP setKey(java.lang.String key) {
        return (SendOTP) super.setKey(key);
      }

      @Override
      public SendOTP setOauthToken(java.lang.String oauthToken) {
        return (SendOTP) super.setOauthToken(oauthToken);
      }

      @Override
      public SendOTP setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SendOTP) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SendOTP setQuotaUser(java.lang.String quotaUser) {
        return (SendOTP) super.setQuotaUser(quotaUser);
      }

      @Override
      public SendOTP setUserIp(java.lang.String userIp) {
        return (SendOTP) super.setUserIp(userIp);
      }

      @Override
      public SendOTP set(String parameterName, Object value) {
        return (SendOTP) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Yabi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Yabi}. */
    @Override
    public Yabi build() {
      return new Yabi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link YabiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setYabiRequestInitializer(
        YabiRequestInitializer yabiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(yabiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}