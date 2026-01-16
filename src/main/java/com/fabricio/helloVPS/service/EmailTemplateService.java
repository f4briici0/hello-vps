package com.fabricio.helloVPS.service;

import org.springframework.stereotype.Service;

@Service
public class EmailTemplateService {

    public String emailTemplate(String json) {
        return String.format("""
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
            </head>
            <body style="font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f4f4f7; margin: 0; padding: 0;">
                
                <table role="presentation" width="100%%" cellspacing="0" cellpadding="0" border="0" style="background-color: #f4f4f7; padding: 20px;">
                    <tr>
                        <td align="center">
                            
                            <table role="presentation" cellspacing="0" cellpadding="0" border="0" style="max-width: 600px; width: 100%%; background-color: #ffffff; border-radius: 8px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); overflow: hidden;">
                                
                                <tr>
                                    <td style="background-color: #4F46E5; padding: 30px; text-align: center;">
                                        <h1 style="color: #ffffff; margin: 0; font-size: 24px;">Teste realizado com Sucesso! 🎉</h1>
                                    </td>
                                </tr>

                                <tr>
                                    <td style="padding: 30px; color: #333333; line-height: 1.6;">
                                        <p style="margin-top: 0;">Olá!</p>
                                        <p>Se você recebeu este e-mail, a integração do <strong>Google OAuth2</strong> e o deploy na <strong>Oracle Cloud</strong> funcionaram perfeitamente.</p>
                                        
                                        <p>Para demonstrar como a autenticação via Google funciona, abaixo estão os dados brutos recuperados durante o login. Lembre-se:</p>
                                        
                                        <ul style="background-color: #fffbe6; border-left: 4px solid #f59e0b; padding: 15px 15px 15px 35px; margin: 20px 0; list-style-type: disc; color: #b45309;">
                                            <li style="margin-bottom: 5px;">Esses são dados padrão liberados pelo Google.</li>
                                            <li>A permissão varia dependendo do escopo solicitado pelo site.</li>
                                        </ul>

                                        <p style="margin-bottom: 10px; font-weight: bold;">Dados da Autenticação:</p>
                                        
                                        <div style="background-color: #1e293b; border-radius: 6px; padding: 15px; margin-bottom: 25px; overflow-x: auto;">
                                            <pre style="margin: 0; color: #e2e8f0; font-family: 'Courier New', Courier, monospace; font-size: 13px; white-space: pre-wrap; word-wrap: break-word;">%s</pre>
                                        </div>

                                        <p style="margin-bottom: 0;">Muito obrigado pela sua participação!</p>
                                        <p style="margin-top: 5px;">Um grande abraço,</p>
                                        <p style="font-weight: bold; color: #4F46E5;">Fabrício Lindão - 2026</p>
                                    </td>
                                </tr>
                                
                                <tr>
                                    <td style="background-color: #f9fafb; padding: 20px; text-align: center; font-size: 12px; color: #6b7280; border-top: 1px solid #e5e7eb;">
                                        <p style="margin: 0;">&copy; 2026 Projeto VPS & OAuth2.</p>
                                        <p style="margin: 5px 0 0;">Enviado automaticamente pelo sistema.</p>
                                    </td>
                                </tr>
                            </table>

                        </td>
                    </tr>
                </table>
            </body>
            </html>
        """, json);
    }
}