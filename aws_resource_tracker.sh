#!/bin/bash

############################################

# Author: Padmaja Amaradhi
#
# Date : September 11th 2025
#
# Scope: Writing script to manage and list all resources in AWS and integrate with cron job

#Version : V1
###########################################
set -x #Debug mode
set -e #Error exit mode
set -o #pipefail mode

export AWS_REGION=us-east-1
export output="json"

echo "Writing all aws resoruce usage"

### Listing all S3 resoruces
echo "List all s3 resources"
aws s3 ls

## Insatances details
echo "list all ec2 instances"
aws ec2 describe-instances --output json

## AWS LAmbda functions
echo "List all Lambda functions"
aws lambda list-functions --output json

##AWS IAM Users
echo "List IAM USers"
aws iam list-users --output json

