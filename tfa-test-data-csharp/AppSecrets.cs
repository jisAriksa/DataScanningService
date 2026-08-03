using System;
using System.Collections.Generic;

namespace Tfa.Scanner.Fixtures;

public static class AppSecrets
{
    public static readonly IReadOnlyDictionary<string, string> Values = new Dictionary<string, string>
    {
        ["OpenAI:ApiKey"] = Environment.GetEnvironmentVariable("OPENAI_API_KEY") ?? "sk-proj-TFA2026CSharpFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOP",
        ["Anthropic:ApiKey"] = "sk-ant-api03-TFA2026CSharpFixtureAnthropicA1b2C3d4E5f6G7h",
        ["GoogleAI:ApiKey"] = "AIzaSyD-TFA2026CSharpFixtureGeminiKey5u4t3s2r1q0",
        ["AzureOpenAI:ApiKey"] = "2f4d6b8a0c1e3f5d7a9c2e4b6d8f0a1c",
        ["Cohere:ApiKey"] = "cohere_TFA2026_csharp_fixture_key_3c017ac8842218c3ac2",
        ["Mistral:ApiKey"] = "mistral_TFA2026_csharp_fixture_live_93e8d41f5c6a7b2d9d",
        ["HuggingFace:Token"] = "hf_TFA2026CSharpFixtureTokenAB12cd34EF56gh78IJ90",
        ["Groq:ApiKey"] = "gsk_TFA2026CSharpFixtureGroqKeyAB12cd34EF56gh78IJ90",
        ["Together:ApiKey"] = "together_TFA2026_csharp_fixture_0123456789abcdef",
        ["Replicate:ApiToken"] = "r8_TFA2026CSharpFixtureReplicateToken1234567890ab",
        ["GitHub:Pat"] = "github_pat_11CSAABBCCDDEEFF00112233445566778899aabbccddeeff",
        ["Slack:BotToken"] = "xoxb-753159456000-TFA2026CSHARPBOT-abcdefghijklmnopqrstuvwx",
        ["AWS:AccessKeyId"] = "AKIA7TFACS26EDCV",
        ["AWS:SecretAccessKey"] = "sN9wTp4xU8vD3yE1uF6gH0jK4lM5nO2sA7zX8vB",
        ["Jwt:SigningSecret"] = "tfa-csharp-jwt-signing-secret-2026",
        ["SqlServer:Password"] = "ProdLikeCSharpDbPass!2026"
    };
}
