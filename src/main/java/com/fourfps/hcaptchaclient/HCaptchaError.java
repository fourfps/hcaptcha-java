package com.fourfps.hcaptchaclient;

public enum HCaptchaError {
    MISSING_INPUT_SECRET,
    INVALID_INPUT_SECRET,
    MISSING_INPUT_RESPONSE,
    INVALID_INPUT_RESPONSE,
    BAD_REQUEST,
    INVALID_RESPONSE,
    NO_DUMMY_PASSCODE,
    SITEKEY_SECRET_MISMATCH
}
