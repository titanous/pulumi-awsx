// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.awsx.inputs;

import com.pulumi.aws.s3.inputs.BucketCorsRuleArgs;
import com.pulumi.aws.s3.inputs.BucketGrantArgs;
import com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs;
import com.pulumi.aws.s3.inputs.BucketLoggingArgs;
import com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs;
import com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs;
import com.pulumi.aws.s3.inputs.BucketVersioningArgs;
import com.pulumi.aws.s3.inputs.BucketWebsiteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The set of arguments for constructing a Bucket resource.
 * 
 */
public final class BucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    @Import(name="accelerationStatus")
    private @Nullable Output<String> accelerationStatus;

    /**
     * @return Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    public Optional<Output<String>> accelerationStatus() {
        return Optional.ofNullable(this.accelerationStatus);
    }

    /**
     * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    /**
     * @return Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    /**
     * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    @Import(name="corsRules")
    private @Nullable Output<List<BucketCorsRuleArgs>> corsRules;

    /**
     * @return A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    public Optional<Output<List<BucketCorsRuleArgs>>> corsRules() {
        return Optional.ofNullable(this.corsRules);
    }

    /**
     * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    @Import(name="grants")
    private @Nullable Output<List<BucketGrantArgs>> grants;

    /**
     * @return An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    public Optional<Output<List<BucketGrantArgs>>> grants() {
        return Optional.ofNullable(this.grants);
    }

    /**
     * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
     * 
     */
    @Import(name="hostedZoneId")
    private @Nullable Output<String> hostedZoneId;

    /**
     * @return The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
     * 
     */
    public Optional<Output<String>> hostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }

    /**
     * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    @Import(name="lifecycleRules")
    private @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;

    /**
     * @return A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleArgs>>> lifecycleRules() {
        return Optional.ofNullable(this.lifecycleRules);
    }

    /**
     * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    @Import(name="loggings")
    private @Nullable Output<List<BucketLoggingArgs>> loggings;

    /**
     * @return A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    public Optional<Output<List<BucketLoggingArgs>>> loggings() {
        return Optional.ofNullable(this.loggings);
    }

    /**
     * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     */
    @Import(name="objectLockConfiguration")
    private @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration;

    /**
     * @return A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     */
    public Optional<Output<BucketObjectLockConfigurationArgs>> objectLockConfiguration() {
        return Optional.ofNullable(this.objectLockConfiguration);
    }

    /**
     * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a `pulumi preview`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a `pulumi preview`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    @Import(name="replicationConfiguration")
    private @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration;

    /**
     * @return A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    public Optional<Output<BucketReplicationConfigurationArgs>> replicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }

    /**
     * Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    @Import(name="requestPayer")
    private @Nullable Output<String> requestPayer;

    /**
     * @return Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    public Optional<Output<String>> requestPayer() {
        return Optional.ofNullable(this.requestPayer);
    }

    /**
     * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    @Import(name="serverSideEncryptionConfiguration")
    private @Nullable Output<BucketServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    /**
     * @return A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    public Optional<Output<BucketServerSideEncryptionConfigurationArgs>> serverSideEncryptionConfiguration() {
        return Optional.ofNullable(this.serverSideEncryptionConfiguration);
    }

    /**
     * A map of tags to assign to the bucket. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the bucket. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    @Import(name="versioning")
    private @Nullable Output<BucketVersioningArgs> versioning;

    /**
     * @return A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    public Optional<Output<BucketVersioningArgs>> versioning() {
        return Optional.ofNullable(this.versioning);
    }

    /**
     * A website object (documented below).
     * 
     */
    @Import(name="website")
    private @Nullable Output<BucketWebsiteArgs> website;

    /**
     * @return A website object (documented below).
     * 
     */
    public Optional<Output<BucketWebsiteArgs>> website() {
        return Optional.ofNullable(this.website);
    }

    /**
     * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    @Import(name="websiteDomain")
    private @Nullable Output<String> websiteDomain;

    /**
     * @return The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    public Optional<Output<String>> websiteDomain() {
        return Optional.ofNullable(this.websiteDomain);
    }

    /**
     * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    @Import(name="websiteEndpoint")
    private @Nullable Output<String> websiteEndpoint;

    /**
     * @return The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    public Optional<Output<String>> websiteEndpoint() {
        return Optional.ofNullable(this.websiteEndpoint);
    }

    private BucketArgs() {}

    private BucketArgs(BucketArgs $) {
        this.accelerationStatus = $.accelerationStatus;
        this.acl = $.acl;
        this.arn = $.arn;
        this.bucket = $.bucket;
        this.bucketPrefix = $.bucketPrefix;
        this.corsRules = $.corsRules;
        this.forceDestroy = $.forceDestroy;
        this.grants = $.grants;
        this.hostedZoneId = $.hostedZoneId;
        this.lifecycleRules = $.lifecycleRules;
        this.loggings = $.loggings;
        this.objectLockConfiguration = $.objectLockConfiguration;
        this.policy = $.policy;
        this.replicationConfiguration = $.replicationConfiguration;
        this.requestPayer = $.requestPayer;
        this.serverSideEncryptionConfiguration = $.serverSideEncryptionConfiguration;
        this.tags = $.tags;
        this.versioning = $.versioning;
        this.website = $.website;
        this.websiteDomain = $.websiteDomain;
        this.websiteEndpoint = $.websiteEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketArgs $;

        public Builder() {
            $ = new BucketArgs();
        }

        public Builder(BucketArgs defaults) {
            $ = new BucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerationStatus Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
         * 
         * @return builder
         * 
         */
        public Builder accelerationStatus(@Nullable Output<String> accelerationStatus) {
            $.accelerationStatus = accelerationStatus;
            return this;
        }

        /**
         * @param accelerationStatus Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
         * 
         * @return builder
         * 
         */
        public Builder accelerationStatus(String accelerationStatus) {
            return accelerationStatus(Output.of(accelerationStatus));
        }

        /**
         * @param acl The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param arn The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param bucket The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param bucketPrefix Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * @param bucketPrefix Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        /**
         * @param corsRules A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder corsRules(@Nullable Output<List<BucketCorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<BucketCorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder corsRules(BucketCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        /**
         * @param forceDestroy A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
         * 
         * @return builder
         * 
         */
        public Builder grants(@Nullable Output<List<BucketGrantArgs>> grants) {
            $.grants = grants;
            return this;
        }

        /**
         * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
         * 
         * @return builder
         * 
         */
        public Builder grants(List<BucketGrantArgs> grants) {
            return grants(Output.of(grants));
        }

        /**
         * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
         * 
         * @return builder
         * 
         */
        public Builder grants(BucketGrantArgs... grants) {
            return grants(List.of(grants));
        }

        /**
         * @param hostedZoneId The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            $.hostedZoneId = hostedZoneId;
            return this;
        }

        /**
         * @param hostedZoneId The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket&#39;s region.
         * 
         * @return builder
         * 
         */
        public Builder hostedZoneId(String hostedZoneId) {
            return hostedZoneId(Output.of(hostedZoneId));
        }

        /**
         * @param lifecycleRules A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(@Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules) {
            $.lifecycleRules = lifecycleRules;
            return this;
        }

        /**
         * @param lifecycleRules A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(List<BucketLifecycleRuleArgs> lifecycleRules) {
            return lifecycleRules(Output.of(lifecycleRules));
        }

        /**
         * @param lifecycleRules A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder lifecycleRules(BucketLifecycleRuleArgs... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }

        /**
         * @param loggings A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder loggings(@Nullable Output<List<BucketLoggingArgs>> loggings) {
            $.loggings = loggings;
            return this;
        }

        /**
         * @param loggings A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder loggings(List<BucketLoggingArgs> loggings) {
            return loggings(Output.of(loggings));
        }

        /**
         * @param loggings A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder loggings(BucketLoggingArgs... loggings) {
            return loggings(List.of(loggings));
        }

        /**
         * @param objectLockConfiguration A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
         * 
         * @return builder
         * 
         */
        public Builder objectLockConfiguration(@Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration) {
            $.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        /**
         * @param objectLockConfiguration A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
         * 
         * @return builder
         * 
         */
        public Builder objectLockConfiguration(BucketObjectLockConfigurationArgs objectLockConfiguration) {
            return objectLockConfiguration(Output.of(objectLockConfiguration));
        }

        /**
         * @param policy A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a `pulumi preview`. In this case, please make sure you use the verbose/specific version of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing in a `pulumi preview`. In this case, please make sure you use the verbose/specific version of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param replicationConfiguration A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder replicationConfiguration(@Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration) {
            $.replicationConfiguration = replicationConfiguration;
            return this;
        }

        /**
         * @param replicationConfiguration A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
         * 
         * @return builder
         * 
         */
        public Builder replicationConfiguration(BucketReplicationConfigurationArgs replicationConfiguration) {
            return replicationConfiguration(Output.of(replicationConfiguration));
        }

        /**
         * @param requestPayer Specifies who should bear the cost of Amazon S3 data transfer.
         * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
         * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
         * developer guide for more information.
         * 
         * @return builder
         * 
         */
        public Builder requestPayer(@Nullable Output<String> requestPayer) {
            $.requestPayer = requestPayer;
            return this;
        }

        /**
         * @param requestPayer Specifies who should bear the cost of Amazon S3 data transfer.
         * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
         * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
         * developer guide for more information.
         * 
         * @return builder
         * 
         */
        public Builder requestPayer(String requestPayer) {
            return requestPayer(Output.of(requestPayer));
        }

        /**
         * @param serverSideEncryptionConfiguration A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionConfiguration(@Nullable Output<BucketServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            $.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        /**
         * @param serverSideEncryptionConfiguration A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionConfiguration(BucketServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            return serverSideEncryptionConfiguration(Output.of(serverSideEncryptionConfiguration));
        }

        /**
         * @param tags A map of tags to assign to the bucket. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the bucket. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param versioning A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
         * 
         * @return builder
         * 
         */
        public Builder versioning(@Nullable Output<BucketVersioningArgs> versioning) {
            $.versioning = versioning;
            return this;
        }

        /**
         * @param versioning A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
         * 
         * @return builder
         * 
         */
        public Builder versioning(BucketVersioningArgs versioning) {
            return versioning(Output.of(versioning));
        }

        /**
         * @param website A website object (documented below).
         * 
         * @return builder
         * 
         */
        public Builder website(@Nullable Output<BucketWebsiteArgs> website) {
            $.website = website;
            return this;
        }

        /**
         * @param website A website object (documented below).
         * 
         * @return builder
         * 
         */
        public Builder website(BucketWebsiteArgs website) {
            return website(Output.of(website));
        }

        /**
         * @param websiteDomain The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
         * 
         * @return builder
         * 
         */
        public Builder websiteDomain(@Nullable Output<String> websiteDomain) {
            $.websiteDomain = websiteDomain;
            return this;
        }

        /**
         * @param websiteDomain The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
         * 
         * @return builder
         * 
         */
        public Builder websiteDomain(String websiteDomain) {
            return websiteDomain(Output.of(websiteDomain));
        }

        /**
         * @param websiteEndpoint The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
         * 
         * @return builder
         * 
         */
        public Builder websiteEndpoint(@Nullable Output<String> websiteEndpoint) {
            $.websiteEndpoint = websiteEndpoint;
            return this;
        }

        /**
         * @param websiteEndpoint The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
         * 
         * @return builder
         * 
         */
        public Builder websiteEndpoint(String websiteEndpoint) {
            return websiteEndpoint(Output.of(websiteEndpoint));
        }

        public BucketArgs build() {
            return $;
        }
    }

}